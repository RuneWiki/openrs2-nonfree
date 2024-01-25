import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
	public static int anInt2775 = 0;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V")
	public static void method2592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class49 local7 = Static229.aClass49ArrayArrayArray6[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class49 local28 = Static229.aClass49ArrayArrayArray6[local9][arg0][arg1] = Static229.aClass49ArrayArrayArray6[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte25--;
				for (@Pc(40) Class47 local40 = local28.aClass47_3; local40 != null; local40 = local40.aClass47_2) {
					@Pc(44) Class22_Sub2 local44 = local40.aClass22_Sub2_1;
					if (local44.aShort83 == arg0 && local44.aShort81 == arg1) {
						local44.aByte69--;
					}
				}
			}
		}
		if (Static229.aClass49ArrayArrayArray6[0][arg0][arg1] == null) {
			Static229.aClass49ArrayArrayArray6[0][arg0][arg1] = new Class49(0, arg0, arg1);
			Static229.aClass49ArrayArrayArray6[0][arg0][arg1].aByte24 = 1;
		}
		Static229.aClass49ArrayArrayArray6[0][arg0][arg1].aClass49_1 = local7;
		Static229.aClass49ArrayArrayArray6[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)V")
	public static void method2593() {
		Static182.aClass103_31.method2679(5);
		Static138.aClass103_27.method2679(5);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
	public static void method2594() {
		Static348.aString431 = "Iniciando biblioteca 3D";
		Static227.aString417 = " já está na sua lista de amigos.";
		Static251.aString414 = "Carregando...";
		Static339.aString425 = "Cancelar";
		Static35.aString79 = "Carregando. Aguarde.";
		Static28.aString60 = "Biblioteca 3D iniciada";
		Static118.aString418 = "Carregando texturas - ";
		Static211.aString273 = "Carregando fontes - ";
		Static70.aString126 = "Carregando padrões - ";
		Static125.aString191 = "Gerenciador de entradas carregado";
		Static8.aString11 = "Pegar";
		Static314.aString387 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
		Static279.aString438 = "Pacote de palavras carregado";
		Static259.aString316 = "brilho3:";
		Static211.aString274 = "rolagem:";
		Static266.aString333 = " já está na sua lista de ignorados.";
		Static281.aString324 = "K";
		Static47.aString93 = "Carregando tela título - ";
		Static248.aString307 = "Alocando memória";
		Static240.aString421 = "Virar para cá";
		Static233.aString292 = "Dados da lista de mundos carregados";
		Static286.aString356 = "Você não pode adicionar a si próprio à sua lista de amigos.";
		Static237.aString296 = "Remova ";
		Static249.aString100 = "Memória alocada";
		Static293.aString366 = "Tela título aberta";
		Static66.aString120 = "Padrões carregados";
		Static117.aString185 = "Carregando dados da lista de mundos";
		Static193.aString248 = "brilho2:";
		Static246.aString305 = "Oculto";
		Static97.aString163 = "M";
		Static323.aString400 = "Tela título carregada";
		Static113.aString178 = "cyan:";
		Static337.aString419 = "Selecionar";
		Static203.aString262 = "Mechscape carregando. Aguarde...";
		Static261.aString319 = "brilho3:";
		Static161.aString220 = "tremor:";
		Static55.aString108 = "Conectado ao servidor de atualização";
		Static329.aString408 = "Lista de atualizações carregada";
		Static253.aString310 = "Conexão perdida.";
		Static47.aString94 = "onda2:";
		Static199.aString256 = "brilho1:";
		Static261.aString320 = "onda:";
		Static263.aString326 = "Ok";
		Static169.aString231 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
		Static200.aString258 = " da sua lista de amigos primeiro.";
		Static146.aString210 = "Aguarde...";
		Static327.aString407 = " da sua lista de ignorados primeiro.";
		Static314.aString386 = "Config carregada";
		Static160.aString219 = "Não é possível encontrar ";
		Static135.aString197 = "Carregando sprites - ";
		Static140.aString199 = "RuneScape carregando. Aguarde...";
		Static304.aString376 = "qualificação: ";
		Static161.aString221 = "Atacar";
		Static8.aString12 = "Descartar";
		Static57.aString110 = " mais opções";
		Static256.aString313 = "Usar";
		Static98.aString90 = "Examinar";
		Static289.aString162 = "nível: ";
		Static207.aString269 = "Continuar";
		Static283.aString351 = "Carregando interfaces - ";
		Static159.aString217 = "flash1:";
		Static254.aString312 = "Selecionar opção";
		Static233.aString293 = "Texturas carregadas";
		Static271.aString337 = " saiu do jogo.";
		Static28.aString59 = "roxo:";
		Static302.aString424 = "Carregando config - ";
		Static184.aString244 = "K";
		Static102.aString166 = "habilidade: ";
		Static263.aString327 = "Objeto para membros";
		Static54.aString104 = "Verificando atualizações - ";
		Static160.aString218 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
		Static33.aString65 = "verde:";
		Static350.aString434 = "Tentando reestabelecer conexão. Aguarde.";
		Static34.aString70 = "Sprites carregados";
		Static267.aString334 = "Largar";
		Static262.aString322 = "amarelo:";
		Static329.aString409 = "vermelho:";
		Static88.aString260 = "Carregando pacote de palavras - ";
		Static240.aString420 = "Fechar";
		Static272.aString341 = "Caminhar para cá";
		Static10.aString14 = "Interfaces carregadas";
		Static232.aString290 = "Remova ";
		Static293.aString365 = " entrou no jogo.";
		Static266.aString332 = "M";
		Static198.aString253 = "As variáveis do sistema foram carregadas";
		Static241.aString301 = "branco:";
		Static49.aString95 = "flash2:";
		Static309.aString381 = " ";
		Static162.aString158 = "Mecanismo de som preparado";
		Static21.aString32 = "Conectando ao servidor de atualização";
		Static66.aString121 = "Universo de jogo criado";
		Static162.aString159 = "Fontes carregadas";
		Static2.aString1 = "deslizamento:";
	}
}
