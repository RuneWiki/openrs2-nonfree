import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "[Lclient!rj;")
	public static Class2_Sub3_Sub1[] aClass2_Sub3_Sub1Array4;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "Lclient!jd;")
	public static Class84 aClass84_30;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	public static int anInt1453 = -2;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString76 = "scroll:";

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "[I")
	public static int[] anIntArray107 = new int[256];

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
	public static int anInt1459 = 0;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
	public static int anInt1462 = -1;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
	public static void method1255(@OriginalArg(1) int arg0) {
		Static61.anInt2999 = arg0;
		Static34.anInt1968 = -1;
		Static34.anInt1968 = -1;
		Static133.method2322();
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)I")
	public static int method1256(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)Lclient!ef;")
	public static Class49 method1257() {
		try {
			return (Class49) Class.forName("Class49_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZIII)V")
	public static void method1259(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static213.anInt4460++;
		Static84.method683();
		@Pc(25) int local25;
		if (arg1) {
			Static218.method3694(false, false, 0);
		} else {
			Static108.method2008(0);
			Static218.method3694(false, true, 0);
			if (Static233.anInt4789 == 0) {
				for (local25 = 1; local25 <= 5; local25++) {
					Static218.method3694(false, false, local25);
					Static218.method3694(true, false, local25);
					Static108.method2008(local25);
				}
			} else {
				for (local25 = 1; local25 <= 5; local25++) {
					Static108.method2008(local25);
					Static218.method3694(false, false, local25);
					Static218.method3694(true, false, local25);
				}
			}
		}
		if (!arg1) {
			Static236.method3909();
		}
		Static111.method2067();
		if (Static60.aBoolean106) {
			Static146.method2584(arg2, arg3, true, arg0, arg4);
			arg2 = Static44.anInt1075;
			arg3 = Static86.anInt1914;
			arg0 = Static34.anInt1962;
			arg4 = Static37.anInt907;
		}
		@Pc(156) int local156;
		if (Static101.anInt6027 == 1) {
			local25 = (int) Static198.aFloat41;
			if (Static182.anInt3886 / 256 > local25) {
				local25 = Static182.anInt3886 / 256;
			}
			if (Static198.aBooleanArray19[4] && local25 < Static250.anIntArray447[4] + 128) {
				local25 = Static250.anIntArray447[4] + 128;
			}
			local156 = Static83.anInt1889 + (int) Static142.aFloat31 & 0x7FF;
			Static202.method3404(local25, Static99.method1894(Static208.anInt4335, Static111.aClass36_Sub3_Sub2_1.anInt5109, Static111.aClass36_Sub3_Sub2_1.anInt5093) - 50, Static247.anInt4924, arg0, local156, Static280.anInt5827, local25 * 3 + 600);
		} else if (Static101.anInt6027 == 5) {
			Static17.method363(arg0);
		}
		@Pc(181) int local181 = Static255.anInt5182;
		local156 = Static133.anInt2729;
		local25 = Static271.anInt5632;
		@Pc(187) int local187 = Static210.anInt4376;
		@Pc(189) int local189 = Static265.anInt5500;
		@Pc(191) int local191;
		@Pc(237) int local237;
		for (local191 = 0; local191 < 5; local191++) {
			if (Static198.aBooleanArray19[local191]) {
				local237 = (int) ((double) -Static264.anIntArray481[local191] + (double) (Static264.anIntArray481[local191] * 2 + 1) * Math.random() + Math.sin((double) Static214.anIntArray363[local191] / 100.0D * (double) Static57.anIntArray146[local191]) * (double) Static250.anIntArray447[local191]);
				if (local191 == 0) {
					Static271.anInt5632 += local237;
				}
				if (local191 == 4) {
					Static210.anInt4376 += local237;
					if (Static210.anInt4376 < 128) {
						Static210.anInt4376 = 128;
					}
					if (Static210.anInt4376 > 383) {
						Static210.anInt4376 = 383;
					}
				}
				if (local191 == 2) {
					Static255.anInt5182 += local237;
				}
				if (local191 == 3) {
					Static265.anInt5500 = local237 + Static265.anInt5500 & 0x7FF;
				}
				if (local191 == 1) {
					Static133.anInt2729 += local237;
				}
			}
		}
		Static70.method1324();
		@Pc(360) int local360;
		if (Static60.aBoolean106) {
			Static94.method1752(arg3, arg2, arg3 + arg4, arg2 - -arg0);
			@Pc(315) float local315 = (float) Static210.anInt4376 * 0.17578125F;
			@Pc(320) float local320 = (float) Static265.anInt5500 * 0.17578125F;
			if (Static101.anInt6027 == 3) {
				local315 = Static188.aFloat40 * 360.0F / 6.2831855F;
				local320 = Static226.aFloat20 * 360.0F / 6.2831855F;
			}
			if (Static236.anInt4804 == 10) {
				local360 = Static195.method3280(Static37.anInt906, Static255.anInt5182 >> 10, Static105.anInt2269, Static271.anInt5632 >> 10);
			} else {
				local360 = Static195.method3280(Static37.anInt906, Static111.aClass36_Sub3_Sub2_1.anIntArray468[0] >> 3, Static105.anInt2269, Static111.aClass36_Sub3_Sub2_1.anIntArray465[0] >> 3);
			}
			if (Static200.anInt4150 >= 0) {
				Static60.method1137();
				@Pc(386) Class137 local386 = Static58.method1128(Static200.anInt4150, Static173.anInt3685, Static79.anInt1756, Static266.anInt5528);
				local386.method3431(Static180.anInt3867, arg3, arg2, arg4, arg0, Static210.anInt4376, Static265.anInt5500, local360);
			} else {
				Static60.method1140(local360);
			}
			Static60.method1174(arg3, arg2, arg4, arg0, arg3 + arg4 / 2, arg0 / 2 + arg2, local315, local320, Static289.anInt6018, Static289.anInt6018);
			Static143.method2540(false);
			Static60.method1170();
			Static60.method1178(true);
			Static60.method1151(true);
		} else {
			Static160.method2781(arg3, arg2, arg3 + arg4, arg2 - -arg0);
			Static93.method1725();
			if (Static200.anInt4150 >= 0) {
				@Pc(452) Class137 local452 = Static58.method1128(Static200.anInt4150, Static173.anInt3685, Static79.anInt1756, Static266.anInt5528);
				local452.method3429(Static180.anInt3867, arg3, arg2, arg4, arg0, Static210.anInt4376, Static265.anInt5500);
			} else {
				Static160.method2788(arg3, arg2, arg4, arg0, 0);
			}
		}
		if (Static299.aBoolean203 || arg3 > Static9.anInt275 || Static9.anInt275 >= arg4 + arg3 || Static68.anInt1506 < arg2 || arg2 + arg0 <= Static68.anInt1506) {
			Static88.aBoolean395 = false;
			Static243.anInt3777 = 0;
		} else {
			Static88.aBoolean395 = true;
			local237 = Static176.anInt3789;
			Static243.anInt3777 = 0;
			local360 = Static260.anInt5417;
			local191 = Static107.anInt2320;
			@Pc(517) int local517 = Static212.anInt4456;
			Static119.anInt2560 = local360 + (Static68.anInt1506 - arg2) * (local517 - local360) / arg0;
			Static163.anInt3420 = local191 + (Static9.anInt275 - arg3) * (-local191 + local237) / arg4;
		}
		Static203.method3422();
		@Pc(556) byte local556 = Static52.method1039() == 2 ? (byte) Static213.anInt4460 : 1;
		if (Static60.aBoolean106) {
			Static128.method2270(Static148.anInt3168, !Static242.aBoolean414);
			Static245.method4415(Static265.anInt5500, Static210.anInt4376, Static133.anInt2729, Static271.anInt5632, Static255.anInt5182);
			Static60.anInt1340 = Static148.anInt3168;
			Static212.method3610(Static271.anInt5632, Static133.anInt2729, Static255.anInt5182, Static210.anInt4376, Static265.anInt5500, Static104.aByteArrayArrayArray6, Static162.anIntArray257, Static40.anIntArray60, Static212.anIntArray362, Static170.anIntArray294, Static112.anIntArray165, Static208.anInt4335 + 1, local556, Static111.aClass36_Sub3_Sub2_1.anInt5093 >> 7, Static111.aClass36_Sub3_Sub2_1.anInt5109 >> 7);
			Static295.aBoolean488 = true;
			Static128.method2272();
			Static245.method4415(0, 0, 0, 0, 0);
			Static203.method3422();
			Static279.method4655(Static289.anInt6018, arg2, Static289.anInt6018, arg0, arg4, arg3);
			Static33.method650(Static289.anInt6018, arg0, arg4, Static289.anInt6018, arg2, arg3);
			Static155.method4930();
		} else {
			Static212.method3610(Static271.anInt5632, Static133.anInt2729, Static255.anInt5182, Static210.anInt4376, Static265.anInt5500, Static104.aByteArrayArrayArray6, Static162.anIntArray257, Static40.anIntArray60, Static212.anIntArray362, Static170.anIntArray294, Static112.anIntArray165, Static208.anInt4335 + 1, local556, Static111.aClass36_Sub3_Sub2_1.anInt5093 >> 7, Static111.aClass36_Sub3_Sub2_1.anInt5109 >> 7);
			Static203.method3422();
			Static155.method4930();
			Static279.method4655(256, arg2, 256, arg0, arg4, arg3);
			Static33.method650(256, arg0, arg4, 256, arg2, arg3);
		}
		((Class127_Sub1) Static93.anInterface5_1).method3535(Static37.anInt906);
		Static92.method1717(arg2, arg0, arg3, arg4);
		Static255.anInt5182 = local181;
		Static133.anInt2729 = local156;
		Static210.anInt4376 = local187;
		Static265.anInt5500 = local189;
		Static271.anInt5632 = local25;
		if (Static5.aBoolean15 && Static139.aClass78_2.method1962() == 0) {
			Static5.aBoolean15 = false;
		}
		if (Static5.aBoolean15) {
			if (Static60.aBoolean106) {
				Static94.method1758(arg3, arg2, arg4, arg0, 0);
			} else {
				Static160.method2788(arg3, arg2, arg4, arg0, 0);
			}
			Static264.method4420(false, Static245.aString256);
		}
		if (!arg1 && !Static5.aBoolean15 && !Static299.aBoolean203 && arg3 <= Static9.anInt275 && arg3 + arg4 > Static9.anInt275 && arg2 <= Static68.anInt1506 && Static68.anInt1506 < arg0 + arg2) {
			Static197.method3349(Static68.anInt1506, arg0, Static9.anInt275, arg3, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
	public static void method1263() {
		Static230.aString192 = "Iniciando biblioteca 3D";
		Static110.aString123 = "qualificação: ";
		Static285.aString287 = "branco:";
		Static192.aString199 = " da sua lista de amigos primeiro.";
		Static279.aString278 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
		Static11.aString14 = "Padrões carregados";
		Static293.aString296 = "Carregando config - ";
		Static154.aString158 = "vermelho:";
		Static105.aString115 = "Mecanismo de som preparado";
		Static17.aString26 = "Ok";
		Static47.aString55 = "Pegar";
		Static212.aString224 = "Usar";
		Static221.aString230 = "Tela título carregada";
		Static76.aString83 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
		Static212.aString223 = "Continuar";
		Static243.aString187 = "Conectado ao servidor de atualização";
		Static149.aString152 = "Carregando fontes - ";
		Static185.aString196 = "Universo de jogo criado";
		Static238.aString238 = "Largar";
		Static213.aString225 = "K";
		Static241.aString241 = "Carregando padrões - ";
		Static11.aString15 = "Biblioteca 3D iniciada";
		Static47.aString54 = "Texturas carregadas";
		Static205.aString213 = "Carregando tela título - ";
		Static245.aString256 = "Carregando. Aguarde.";
		Static155.aString301 = "Oculto";
		Static36.aString45 = "onda2:";
		Static100.aString110 = "Carregando...";
		Static273.aString268 = "K";
		Static53.aString60 = "tremor:";
		Static37.aString46 = "Carregando pacote de palavras - ";
		Static100.aString112 = "Carregando interfaces - ";
		Static62.aString71 = "flash1:";
		Static191.aString41 = "Você não pode adicionar a si próprio à sua lista de amigos.";
		Static121.aString130 = "Sprites carregados";
		Static30.aString43 = "Examinar";
		Static63.aString74 = " já está na sua lista de amigos.";
		Static14.aString21 = "Config carregada";
		Static53.aString61 = " mais opções";
		Static162.aString165 = "Gerenciador de entradas carregado";
		Static198.aString207 = "Fontes carregadas";
		Static8.aString12 = "onda:";
		Static109.aString121 = "Caminhar para cá";
		Static55.aString64 = "roxo:";
		Static148.aString151 = "Aguarde...";
		Static156.aString259 = "Virar para cá";
		Static293.aString295 = "nível: ";
		Static106.aString120 = "Tela título aberta";
		Static279.aString277 = "Remova ";
		Static216.aString226 = "Lista de atualizações carregada";
		Static87.aString95 = "habilidade: ";
		Static136.aString138 = "Selecionar";
		Static208.aString217 = " ";
		Static50.aString57 = "Descartar";
		Static299.aString131 = " entrou no jogo.";
		Static37.aString47 = "brilho3:";
		Static242.aString243 = "cyan:";
		Static296.aString300 = "Conectando ao servidor de atualização";
		Static52.aString59 = "deseja negociar com você.";
		Static12.aString17 = "flash2:";
		Static169.aString178 = "Selecionar opção";
		Static267.aString204 = "Interfaces carregadas";
		Static203.aString210 = "Atacar";
		Static202.aString208 = "brilho1:";
		Static275.aString272 = "brilho2:";
		Static152.aString154 = "deslizamento:";
		Static205.aString212 = "Alocando memória";
		Static264.aString257 = "amarelo:";
		Static230.aString191 = "Carregando /secure/libs_v4s/RCras - ";
		Static205.aString214 = "M";
		Static217.aString228 = "Tentando reestabelecer conexão. Aguarde.";
		Static5.aString7 = "Pacote de palavras carregado";
		Static142.aString147 = "Carregando dados da lista de mundos";
		Static165.aString169 = " já está na sua lista de ignorados.";
		Static58.aString67 = "RuneScape carregando. Aguarde...";
		Static17.aString25 = "Dados da lista de mundos carregados";
		Static19.aString29 = "M";
		Static44.aString53 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
		Static246.aString247 = "Conexão perdida.";
		aString76 = "rolagem:";
		Static91.aString102 = "Fechar";
		Static289.aString292 = "Remova ";
		Static30.aString42 = "verde:";
		Static139.aString140 = " saiu do jogo.";
		Static55.aString63 = "Carregando sprites - ";
		Static90.aString100 = "Memória alocada";
		Static88.aString235 = "Verificando atualizações - ";
		Static224.aString233 = "Cancelar";
		Static99.aString108 = "Objeto para membros";
		Static22.aString19 = "Não é possível encontrar ";
		Static164.aString167 = " da sua lista de ignorados primeiro.";
		Static101.aString293 = "brilho3:";
	}
}
