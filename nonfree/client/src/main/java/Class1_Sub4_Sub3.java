import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public final class Class1_Sub4_Sub3 extends Class1_Sub4 implements Interface6 {

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "Lclient!waa;")
	public Class1_Sub4 aClass1_Sub4_2;

	static {
		new Class202("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
	}

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(IIILclient!waa;)V")
	public Class1_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub4 arg3) {
		super(arg0, arg1, arg2, arg3.aShort154, false, false);
		this.aClass1_Sub4_2 = arg3;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method7677(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7686(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7671() {
		return false;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!qa;)Lclient!lb;")
	@Override
	public Class6_Sub5 method7680(@OriginalArg(1) Class39 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7682(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	@Override
	public void method7683() {
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
	@Override
	public void method7675() {
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class63 method7689(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7684() {
		return false;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLclient!qa;)Lclient!ed;")
	@Override
	public Class68 method7676(@OriginalArg(1) Class39 arg0) {
		return this.aClass1_Sub4_2.method7676(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)I")
	@Override
	public int method7685() {
		return 0;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!qa;IIZLclient!se;I)V")
	@Override
	public void method7672(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)I")
	@Override
	public int method7688() {
		return 0;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7673(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)I")
	@Override
	public int method7687() {
		return 0;
	}
}
