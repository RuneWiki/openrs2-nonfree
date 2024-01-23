import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "Lclient!wh;")
	public static Class4_Sub2_Sub12 aClass4_Sub2_Sub12_2;

	@OriginalMember(owner = "client!fi", name = "t", descriptor = "[I")
	public static int[] anIntArray165;

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
	public static int anInt1519;

	@OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
	public static int anInt1529;

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
	public static int anInt1518 = 0;

	@OriginalMember(owner = "client!fi", name = "v", descriptor = "[I")
	public static int[] anIntArray166 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
	public static void method1227() {
		anIntArray165 = null;
		anIntArray166 = null;
		aClass4_Sub2_Sub12_2 = null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([S[Ljava/lang/String;I)V")
	public static void method1228(@OriginalArg(0) short[] arg0, @OriginalArg(1) String[] arg1) {
		Static273.method906(arg1, 0, arg0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!lc;I)V")
	public static void method1230(@OriginalArg(0) Class98 arg0) {
		Static26.aClass98_14 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
	public static void method1232() {
		if (Static267.anInt3573 == 10 && Static178.aBoolean216) {
			Static264.method3976(28);
		}
		if (Static267.anInt3573 == 30) {
			Static264.method3976(25);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BII)V")
	public static void method1233(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < Static88.anInt1823; local11++) {
			@Pc(22) Class35 local22 = Static171.method2693(local11);
			if (local22 != null) {
				@Pc(29) int local29 = local22.anInt1069;
				if (local29 >= 0 && !Static204.anInterface2_1.method1976(local29)) {
					local29 = -1;
				}
				@Pc(91) int local91;
				@Pc(45) int local45;
				@Pc(51) int local51;
				@Pc(82) int local82;
				if (local22.anInt1066 >= 0) {
					local45 = local22.anInt1066;
					local51 = arg1 + (local45 & 0x7F);
					if (local51 < 0) {
						local51 = 0;
					} else if (local51 > 127) {
						local51 = 127;
					}
					local82 = local51 + (local45 + arg0 & 0xFC00) + (local45 & 0x380);
					local91 = Static204.anIntArray354[Static169.method2669(local82, 96)];
				} else if (local29 >= 0) {
					local91 = Static204.anIntArray354[Static169.method2669(Static204.anInterface2_1.method1979(local29), 96)];
				} else if (local22.anInt1071 == -1) {
					local91 = -1;
				} else {
					local45 = local22.anInt1071;
					local51 = (local45 & 0x7F) + arg1;
					if (local51 < 0) {
						local51 = 0;
					} else if (local51 > 127) {
						local51 = 127;
					}
					local82 = local51 + (arg0 + local45 & 0xFC00) + (local45 & 0x380);
					local91 = Static204.anIntArray354[Static169.method2669(local82, 96)];
				}
				Static44.anIntArray115[local11 + 1] = local91;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V")
	public static void method1234() {
		Static247.aString161 = "Fermer";
		Static80.aString42 = "Chargement des fichiers config - ";
		Static198.aString70 = " autres options";
		Static221.aString141 = " de votre liste noire.";
		Static129.aString85 = "niveau ";
		Static63.aString33 = "brillant2:";
		Static234.aString154 = "jaune:";
		Static224.aString144 = "Sélectionner";
		Static125.aString79 = "glissement:";
		Static153.aString102 = "clignotant3:";
		Static230.aString147 = "M";
		Static74.aString39 = "tremblement:";
		Static201.aString125 = "Objet d'abonnés";
		Static191.aString179 = "Veuillez patienter...";
		Static95.aString57 = "clignotant2:";
		Static215.aString135 = "Caché";
		Static46.aString28 = "Chargement des sprites - ";
		Static86.aString50 = "Chargement en cours. Veuillez patienter.";
		Static145.aString96 = "Interfaces chargées";
		Static61.aString31 = "ondulation:";
		Static160.aString107 = "clignotant1:";
		Static145.aString97 = "Attaquer";
		Static243.aString158 = "violet:";
		Static254.aString164 = " ";
		Static245.aString160 = "brillant3:";
		Static83.aString131 = "Monde de jeu créé";
		Static81.aString129 = "Chargement des textures - ";
		Static41.aString21 = "Écran-titre chargé";
		Static194.aString124 = "Librairie 3D démarrée";
		Static25.aString7 = "Module texte chargé";
		Static35.aString16 = "Continuer";
		Static76.aString40 = "Impossible de trouver ";
		Static38.aString17 = "rouge:";
		Static124.aString78 = "Chargement de RuneScape en cours - veuillez patienter...";
		Static222.aString142 = "Mémoire en cours d'attribution";
		Static190.aString123 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
		Static136.aString88 = "Poser";
		Static219.aString139 = "classement ";
		Static240.aString182 = "M";
		Static173.aString112 = "Jeter";
		Static187.aString122 = " est déjà dans votre liste d'amis.";
		Static158.aString106 = "Chargement de la liste des serveurs";
		Static158.aString105 = "Textures chargées";
		Static233.aString153 = "Écran-titre ouvert";
		Static22.aString5 = "Moteur son préparé";
		Static220.aString140 = "K";
		Static180.aString117 = "Connexion au serveur de mise à jour en cours";
		Static41.aString20 = " est déjà dans votre liste noire.";
		Static95.aString60 = "Veuillez commencer par supprimer ";
		Static127.aString82 = "Veuillez patienter - tentative de rétablissement.";
		Static212.aString133 = "Utiliser";
		Static259.aString170 = "Vérification des mises à jour - ";
		Static3.aString2 = "Chargement en cours...";
		Static129.aString86 = "Annuler";
		Static44.aString22 = "Connexion perdue.";
		Static104.aString66 = "Paramètres par défaut chargés";
		Static268.aString183 = "K";
		Static154.aString103 = "Démarrage de la librairie 3D";
		Static121.aString76 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
		Static288.aString71 = "Choisir une option";
		Static6.aString3 = "Gestionnaire de saisie chargé";
		Static129.aString83 = "Veuillez commencer par supprimer ";
		Static86.aString51 = "Sprites chargés";
		Static101.aString163 = "brillant1:";
		Static167.aString108 = " de votre liste d'amis.";
		Static179.aString116 = "Prendre";
		Static191.aString180 = " s'est déconnecté.";
		Static62.aString32 = "Chargement des paramètres par défaut - ";
		Static51.aString29 = "Examiner";
		Static264.aString178 = "blanc:";
		Static1.aString1 = "Chargement des interfaces - ";
		Static97.aString63 = "Connecté au serveur de mise à jour";
		Static275.aString186 = "Atteindre";
		Static182.aString120 = "compétence ";
		Static169.aString110 = "déroulement:";
		Static244.aString159 = "cyan:";
		Static137.aString89 = "vert:";
		Static105.aString67 = " s'est connecté.";
		Static229.aString190 = "OK";
		Static225.aString145 = "Liste des serveurs chargée";
		Static275.aString185 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
		Static255.aString166 = "voudrait faire un échange avec vous.";
		Static191.aString181 = "ondulation2:";
		Static45.aString23 = "Fichiers config chargés";
		Static129.aString84 = "Regarder dans cette direction";
		Static286.aString191 = "Votre liste noire est pleine (100 noms maximum).";
		Static25.aString6 = "Chargement du module texte - ";
		Static67.aString35 = "Polices chargées";
		Static176.aString19 = "Chargement de l'écran-titre - ";
		Static257.aString168 = "Liste des mises à jour chargée";
		Static63.aString34 = "Chargement des polices - ";
		Static113.aString72 = "Mémoire attribuée";
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!p;)V")
	public static void method1235(@OriginalArg(1) Class4_Sub17 arg0) {
		@Pc(9) int local9 = Static38.anInt750 >> 1;
		@Pc(15) int local15 = Static287.anInt2513 >> 2 << 10;
		@Pc(19) byte[][] local19 = new byte[Static269.anInt5031][Static92.anInt1912];
		@Pc(33) int local33;
		@Pc(106) int local106;
		@Pc(118) int local118;
		while (arg0.anInt2400 < arg0.aByteArray30.length) {
			@Pc(31) boolean local31 = false;
			local33 = 0;
			@Pc(35) int local35 = 0;
			if (arg0.method1874() == 1) {
				local31 = true;
				local33 = arg0.method1874();
				local35 = arg0.method1874();
			}
			@Pc(57) int local57 = arg0.method1874();
			@Pc(61) int local61 = arg0.method1874();
			@Pc(67) int local67 = local57 * 64 - Static81.anInt4033;
			@Pc(78) int local78 = Static92.anInt1912 + Static132.anInt2785 - local61 * 64 - 1;
			if (local67 >= 0 && local78 - 63 >= 0 && Static269.anInt5031 > local67 + 63 && Static92.anInt1912 > local78) {
				for (local106 = 0; local106 < 64; local106++) {
					@Pc(116) byte[] local116 = local19[local67 + local106];
					for (local118 = 0; local118 < 64; local118++) {
						if (!local31 || local33 * 8 <= local106 && local106 < local33 * 8 + 8 && local35 * 8 <= local118 && local35 * 8 + 8 > local118) {
							local116[local78 - local118] = arg0.method1892();
						}
					}
				}
			} else if (local31) {
				arg0.anInt2400 += 64;
			} else {
				arg0.anInt2400 += 4096;
			}
		}
		@Pc(184) int local184 = Static269.anInt5031;
		local33 = Static92.anInt1912;
		@Pc(194) int[] local194 = new int[local33];
		@Pc(197) int[] local197 = new int[local33];
		@Pc(200) int[] local200 = new int[local33];
		@Pc(203) int[] local203 = new int[local33];
		@Pc(206) int[] local206 = new int[local33];
		for (local106 = -5; local106 < local184; local106++) {
			@Pc(239) int local239;
			@Pc(305) int local305;
			for (@Pc(217) int local217 = 0; local217 < local33; local217++) {
				local118 = local106 + 5;
				@Pc(286) int local286;
				if (local118 < local184) {
					local239 = local19[local118][local217] & 0xFF;
					if (local239 > 0) {
						@Pc(250) Class142 local250 = Static263.method722(local239 - 1);
						local194[local217] += local250.anInt4375;
						local206[local217] += local250.anInt4372;
						local197[local217] += local250.anInt4368;
						local200[local217] += local250.anInt4377;
						local286 = local203[local217]++;
					}
				}
				local239 = local106 - 5;
				if (local239 >= 0) {
					local305 = local19[local239][local217] & 0xFF;
					if (local305 > 0) {
						@Pc(314) Class142 local314 = Static263.method722(local305 - 1);
						local194[local217] -= local314.anInt4375;
						local206[local217] -= local314.anInt4372;
						local197[local217] -= local314.anInt4368;
						local200[local217] -= local314.anInt4377;
						local286 = local203[local217]--;
					}
				}
			}
			if (local106 >= 0) {
				@Pc(367) int[][] local367 = Static220.anIntArrayArrayArray11[local106 >> 6];
				local118 = 0;
				local239 = 0;
				local305 = 0;
				@Pc(375) int local375 = 0;
				@Pc(377) int local377 = 0;
				for (@Pc(379) int local379 = -5; local379 < local33; local379++) {
					@Pc(390) int local390 = local379 + 5;
					if (local33 > local390) {
						local118 += local194[local390];
						local239 += local206[local390];
						local375 += local203[local390];
						local305 += local197[local390];
						local377 += local200[local390];
					}
					@Pc(427) int local427 = local379 - 5;
					if (local427 >= 0) {
						local118 -= local194[local427];
						local305 -= local197[local427];
						local375 -= local203[local427];
						local239 -= local206[local427];
						local377 -= local200[local427];
					}
					if (local379 >= 0 && local375 > 0) {
						@Pc(474) int[] local474 = local367[local379 >> 6];
						@Pc(492) int local492 = local377 == 0 ? 0 : Static98.method1593(local239 / local375, local118 * 256 / local377, local305 / local375);
						if (local19[local106][local379] != 0) {
							if (local474 == null) {
								local474 = local367[local379 >> 6] = new int[4096];
							}
							@Pc(520) int local520 = local9 + (local492 & 0x7F);
							if (local520 < 0) {
								local520 = 0;
							} else if (local520 > 127) {
								local520 = 127;
							}
							@Pc(547) int local547 = local520 + (local15 + local492 & 0xFC00) + (local492 & 0x380);
							local474[((local379 & 0x3F) << 6) + (local106 & 0x3F)] = Static204.anIntArray354[Static2.method17(96, local547)];
						} else if (local474 != null) {
							local474[(local106 & 0x3F) + ((local379 & 0x3F) << 6)] = 0;
						}
					}
				}
			}
		}
	}
}
