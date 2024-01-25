import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!qm", name = "O", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array17;

	@OriginalMember(owner = "client!qm", name = "Q", descriptor = "I")
	public static int anInt5150;

	@OriginalMember(owner = "client!qm", name = "L", descriptor = "Lclient!te;")
	public static final Class188 aClass188_8 = new Class188(64);

	@OriginalMember(owner = "client!qm", name = "Z", descriptor = "[I")
	public static final int[] anIntArray415 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZB)V")
	public static void method4346(@OriginalArg(0) boolean arg0) {
		if (Static111.aBoolean122 != arg0) {
			Static111.aBoolean122 = arg0;
			Static42.method728();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZ)I")
	public static int method4350(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(Z)Z")
	public static boolean method4351(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static262.anInt6843; local1 < Static131.anInt2754; local1++) {
			@Pc(6) Class45[][] local6 = Static256.aClass45ArrayArrayArray2[local1];
			for (@Pc(9) int local9 = -Static14.anInt494; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static74.anInt1441 + local9;
				@Pc(18) int local18 = Static74.anInt1441 - local9;
				if (local14 >= Static309.anInt6136 || local18 < Static127.anInt2725) {
					for (@Pc(27) int local27 = -Static14.anInt494; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static89.anInt6705 + local27;
						@Pc(36) int local36 = Static89.anInt6705 - local27;
						@Pc(48) Class45 local48;
						if (local14 >= Static309.anInt6136) {
							if (local32 >= Static88.anInt1752) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean63) {
									Static174.aBoolean197 = arg0;
									Static71.aClass103_3.method5640(local48);
									Static71.aClass103_3.method5634();
								}
							}
							if (local36 < Static36.anInt806) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean63) {
									Static174.aBoolean197 = arg0;
									Static71.aClass103_3.method5640(local48);
									Static71.aClass103_3.method5634();
								}
							}
						}
						if (local18 < Static127.anInt2725) {
							if (local32 >= Static88.anInt1752) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean63) {
									Static174.aBoolean197 = arg0;
									Static71.aClass103_3.method5640(local48);
									Static71.aClass103_3.method5634();
								}
							}
							if (local36 < Static36.anInt806) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean63) {
									Static174.aBoolean197 = arg0;
									Static71.aClass103_3.method5640(local48);
									Static71.aClass103_3.method5634();
								}
							}
						}
						if (Static227.anInt4637 == 0) {
							if (Static201.aBoolean235) {
								Static71.aClass103_3.method5629(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V")
	public static void method4352() {
		Static57.aClass24_4.method608();
		Static289.aClass24_27.method608();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!ir;I)V")
	public static void method4353(@OriginalArg(0) Class100 arg0) {
		Static203.aClass100_85 = arg0;
		Static4.anInt68 = Static203.aClass100_85.method2309(19);
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(Z)V")
	public static void method4354() {
		Static322.aString230 = "verde:";
		Static106.aString80 = "Fontes carregadas";
		Static137.aString91 = " entrou no jogo.";
		Static156.aString115 = "Carregando fontes - ";
		Static234.aString185 = "Carregando sprites - ";
		Static168.aString130 = "Carregando. Aguarde.";
		Static26.aString17 = "Iniciando biblioteca 3D";
		Static297.aString219 = "Fechar";
		Static334.aString243 = "Examinar";
		Static45.aString27 = "Memória alocada";
		Static300.aString221 = "Descartar";
		Static317.aString198 = "M";
		Static320.aString90 = "roxo:";
		Static149.aString111 = "K";
		Static40.aString239 = " da sua lista de amigos primeiro.";
		Static337.aString246 = "Pegar";
		Static165.aString123 = " já está na sua lista de ignorados.";
		Static174.aString131 = "Selecionar";
		Static250.aString178 = "Carregando dados da lista de mundos";
		Static352.aString259 = "Verificando atualizações - ";
		Static203.aString160 = "Carregando tela título - ";
		Static95.aString70 = "Config carregada";
		Static264.aString189 = "Caminhar para cá";
		Static212.aString72 = "Largar";
		Static99.aString75 = " mais opções";
		Static28.aString19 = "flash2:";
		Static272.aString193 = "Tentando reestabelecer conexão. Aguarde.";
		Static330.aString236 = "Texturas carregadas";
		Static283.aString167 = "Conexão perdida.";
		Static334.aString244 = "Selecionar opção";
		Static178.aString139 = "Objeto para membros";
		Static350.aString258 = "Cancelar";
		Static92.aString63 = "rolagem:";
		Static350.aString257 = "qualificação: ";
		Static289.aString212 = "Padrões carregados";
		Static68.aString48 = "Dados da lista de mundos carregados";
		Static288.aString211 = "Ok";
		Static87.aString57 = "Usar";
		Static117.aString86 = "Não é possível encontrar ";
		Static92.aString62 = "Aguarde...";
		Static138.aString108 = "Interfaces carregadas";
		Static181.aString31 = "brilho1:";
		Static230.aString247 = "Gerenciador de entradas carregado";
		Static167.aString129 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
		Static174.aString133 = "Lista de atualizações carregada";
		Static1.aString1 = "brilho2:";
		Static226.aString174 = "brilho3:";
		Static115.aString85 = "M";
		Static63.aString46 = "amarelo:";
		Static151.aString112 = "Oculto";
		Static306.aString227 = "habilidade: ";
		Static256.aString183 = "Remova ";
		Static50.aString33 = "Você não pode adicionar a si próprio à sua lista de amigos.";
		Static178.aString140 = "Remova ";
		Static90.aString61 = "cyan:";
		Static81.aString52 = "Pacote de palavras carregado";
		Static336.aString245 = "deslizamento:";
		Static149.aString110 = "Mecanismo de som preparado";
		Static95.aString69 = "K";
		Static299.aString220 = "As variáveis do sistema foram carregadas";
		Static241.aString179 = "brilho3:";
		Static305.aString226 = " da sua lista de ignorados primeiro.";
		Static272.aString194 = "Biblioteca 3D iniciada";
		Static45.aString28 = "Carregando padrões - ";
		Static20.aString11 = "Continuar";
		Static40.aString238 = "RuneScape carregando. Aguarde...";
		Static197.aString153 = "Carregando...";
		Static27.aString18 = "branco:";
		Static111.aString81 = "Alocando memória";
		Static127.aString101 = " ";
		Static37.aString240 = "Carregando pacote de palavras - ";
		Static300.aString222 = "Tela título carregada";
		Static278.aString197 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
		Static113.aString237 = "Conectando ao servidor de atualização";
		Static103.aString77 = " já está na sua lista de amigos.";
		Static353.aString260 = "Sprites carregados";
		Static111.aString82 = "flash1:";
		Static226.aString175 = "Carregando interfaces - ";
		Static181.aString32 = "Mechscape carregando. Aguarde...";
		Static135.aString106 = "nível: ";
		Static157.aString116 = "Conectado ao servidor de atualização";
		Static100.aString76 = "Carregando texturas - ";
		Static153.aString113 = "Virar para cá";
		Static286.aString208 = "onda:";
		Static10.aString4 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
		Static164.aString233 = "Tela título aberta";
		Static5.aString3 = "onda2:";
		Static155.aString68 = "Universo de jogo criado";
		Static122.aString95 = "vermelho:";
		Static300.aString223 = "Atacar";
		Static292.aString216 = " saiu do jogo.";
		Static58.aString37 = "Carregando config - ";
		Static126.aString162 = "tremor:";
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBILclient!dd;II)V")
	public static void method4355(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub12 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt1259 == -1 && arg2.anIntArray81 == null) {
			return;
		}
		@Pc(19) int local19 = 0;
		@Pc(26) int local26 = arg2.anInt1260 * Static260.anInt5195 >> 8;
		if (arg2.anInt1271 < arg0) {
			local19 = arg0 - arg2.anInt1271;
		} else if (arg0 < arg2.anInt1261) {
			local19 = arg2.anInt1261 - arg0;
		}
		if (arg3 > arg2.anInt1257) {
			local19 += arg3 - arg2.anInt1257;
		} else if (arg3 < arg2.anInt1272) {
			local19 += arg2.anInt1272 - arg3;
		}
		if (arg2.anInt1270 == 0 || local19 - 64 > arg2.anInt1270 || Static260.anInt5195 == 0 || arg1 != arg2.anInt1267) {
			if (arg2.aClass3_Sub2_Sub3_2 != null) {
				Static273.aClass3_Sub2_Sub2_2.method1367(arg2.aClass3_Sub2_Sub3_2);
				arg2.aClass3_Sub2_Sub3_2 = null;
			}
			if (arg2.aClass3_Sub2_Sub3_1 != null) {
				Static273.aClass3_Sub2_Sub2_2.method1367(arg2.aClass3_Sub2_Sub3_1);
				arg2.aClass3_Sub2_Sub3_1 = null;
			}
			return;
		}
		local19 -= 64;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(140) int local140 = local26 * (arg2.anInt1270 - local19) / arg2.anInt1270;
		if (arg2.aClass3_Sub2_Sub3_2 != null) {
			arg2.aClass3_Sub2_Sub3_2.method2813(local140);
		} else if (arg2.anInt1259 >= 0) {
			@Pc(155) Class143 local155 = Static365.method3605(Static3.aClass100_1, arg2.anInt1259, 0);
			if (local155 != null) {
				@Pc(162) Class3_Sub17_Sub1 local162 = local155.method3607().method2051(Static323.aClass132_1);
				@Pc(167) Class3_Sub2_Sub3 local167 = Static364.method2795(local162, local140);
				local167.method2811(-1);
				Static273.aClass3_Sub2_Sub2_2.method1366(local167);
				arg2.aClass3_Sub2_Sub3_2 = local167;
			}
		}
		if (arg2.aClass3_Sub2_Sub3_1 != null) {
			arg2.aClass3_Sub2_Sub3_1.method2813(local140);
			if (!arg2.aClass3_Sub2_Sub3_1.method5718()) {
				arg2.aClass3_Sub2_Sub3_1 = null;
			}
		} else if (arg2.anIntArray81 != null && (arg2.anInt1268 -= arg4) <= 0) {
			@Pc(220) int local220 = (int) (Math.random() * (double) arg2.anIntArray81.length);
			@Pc(228) Class143 local228 = Static365.method3605(Static3.aClass100_1, arg2.anIntArray81[local220], 0);
			if (local228 != null) {
				@Pc(235) Class3_Sub17_Sub1 local235 = local228.method3607().method2051(Static323.aClass132_1);
				@Pc(240) Class3_Sub2_Sub3 local240 = Static364.method2795(local235, local140);
				local240.method2811(0);
				Static273.aClass3_Sub2_Sub2_2.method1366(local240);
				arg2.anInt1268 = arg2.anInt1263 + (int) ((double) (arg2.anInt1269 - arg2.anInt1263) * Math.random());
				arg2.aClass3_Sub2_Sub3_1 = local240;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!nb;IIII)V")
	public static void method4356(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static323.method5293(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static103.anInt2156) {
			Static323.method5293(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static323.method5293(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static116.anInt2499) {
			Static323.method5293(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static116.anInt2499) {
			Static323.method5293(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static103.anInt2156 && arg4 <= Static116.anInt2499) {
			Static323.method5293(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static323.method5293(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static103.anInt2156 && arg4 > 0) {
			Static323.method5293(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
