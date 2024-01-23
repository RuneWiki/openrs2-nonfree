import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static76 {

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
	public static int anInt1429 = 0;

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray4 = new byte[250][];

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	public static void method1198() {
		Static258.aString166 = "Carregando texturas - ";
		Static202.aString135 = "Carregando padrões - ";
		Static57.aString33 = "brilho1:";
		Static202.aString136 = "Config carregada";
		Static152.aString101 = "Iniciando biblioteca 3D";
		Static165.aString106 = "Carregando. Aguarde.";
		Static81.aString48 = "Carregando config - ";
		Static15.aString11 = "Sprites carregados";
		Static279.aString174 = "onda:";
		Static236.aString160 = "Carregando sprites - ";
		Static39.aString23 = "Conexão perdida.";
		Static59.aString34 = "brilho3:";
		Static257.aString165 = "Carregando fontes - ";
		Static87.aString55 = "brilho3:";
		Static177.aString82 = "Ok";
		Static66.aString39 = " entrou no jogo.";
		Static77.aString178 = "Biblioteca 3D iniciada";
		Static309.aString194 = "Continuar";
		Static128.aString90 = "Virar para cá";
		Static188.aString124 = "Aguarde...";
		Static5.aString2 = " da sua lista de ignorados primeiro.";
		Static269.aString16 = "Cancelar";
		Static253.aString156 = "Memória alocada";
		Static77.aString177 = "brilho2:";
		Static285.aString179 = "Dados da lista de mundos carregados";
		Static161.aString105 = " já está na sua lista de ignorados.";
		Static292.aString187 = " mais opções";
		Static4.aString1 = "Remova ";
		Static132.aString95 = "onda2:";
		Static208.aString137 = "Carregando pacote de palavras - ";
		Static192.aString132 = "K";
		Static142.aString97 = "deslizamento:";
		Static145.aString100 = "Fontes carregadas";
		Static131.aString93 = "vermelho:";
		Static189.aString125 = "Universo de jogo criado";
		Static131.aString94 = "Tela título carregada";
		Static300.aString191 = "Examinar";
		Static94.aString64 = "Alocando memória";
		Static278.aString173 = " da sua lista de amigos primeiro.";
		Static52.aString31 = "Pegar";
		Static129.aString91 = "Pacote de palavras carregado";
		Static288.aString182 = "cyan:";
		Static105.aString77 = "RuneScape carregando. Aguarde...";
		Static212.aString138 = "Gerenciador de entradas carregado";
		Static235.aString158 = "Carregando interfaces - ";
		Static171.aString110 = "Tela título aberta";
		Static238.aString161 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
		Static175.aString112 = "Tentando reestabelecer conexão. Aguarde.";
		Static304.aString192 = "flash2:";
		Static169.aString109 = "Atacar";
		Static132.aString96 = "Conectando ao servidor de atualização";
		Static269.aString15 = "Caminhar para cá";
		Static81.aString49 = "Não é possível encontrar ";
		Static297.aString190 = "habilidade: ";
		Static286.aString181 = "Largar";
		Static289.aString183 = "Você não pode adicionar a si próprio à sua lista de amigos.";
		Static274.aString171 = "verde:";
		Static177.aString81 = "M";
		Static118.aString87 = "flash1:";
		Static68.aString42 = "rolagem:";
		Static89.aString58 = "Interfaces carregadas";
		Static234.aString154 = "nível: ";
		Static33.aString22 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
		Static175.aString111 = "Padrões carregados";
		Static88.aString56 = "Carregando dados da lista de mundos";
		Static249.aString163 = "Usar";
		Static152.aString102 = " saiu do jogo.";
		Static189.aString126 = "Descartar";
		Static130.aString92 = "Lista de atualizações carregada";
		Static84.aString51 = "M";
		Static143.aString98 = "Selecionar opção";
		Static84.aString52 = "Fechar";
		Static253.aString157 = "Oculto";
		Static172.aString5 = "Carregando tela título - ";
		Static101.aString67 = "Remova ";
		Static286.aString180 = "Objeto para membros";
		Static15.aString10 = "qualificação: ";
		Static106.aString83 = " já está na sua lista de amigos.";
		Static97.aString65 = "Conectado ao servidor de atualização";
		Static88.aString57 = " ";
		Static14.aString8 = "roxo:";
		Static252.aString164 = "tremor:";
		Static144.aString99 = "K";
		Static190.aString131 = "Selecionar";
		Static310.aString41 = "Texturas carregadas";
		Static69.aString44 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
		Static281.aString176 = "Carregando...";
		Static167.aString107 = "Mecanismo de som preparado";
		Static253.aString155 = "Mechscape carregando. Aguarde...";
		Static158.aString69 = "amarelo:";
		Static10.aString6 = "branco:";
		Static6.aString3 = "Verificando atualizações - ";
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!ph;ZLclient!ph;I)V")
	public static void method1201(@OriginalArg(0) Class138 arg0, @OriginalArg(2) Class138 arg1) {
		Static89.aBoolean128 = true;
		Static233.aClass138_63 = arg1;
		Static233.aClass138_62 = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1202(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static154.aClass176_1);
		arg0.removeFocusListener(Static154.aClass176_1);
		Static304.anInt5750 = -1;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B[S[Ljava/lang/String;)V")
	public static void method1203(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static40.method722(arg1, arg1.length - 1, arg0, 0);
	}
}
