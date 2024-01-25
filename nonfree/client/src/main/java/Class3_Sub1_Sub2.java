import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 implements Interface10 {

	@OriginalMember(owner = "client!gf", name = "I", descriptor = "Lclient!ab;")
	public Class3_Sub1 aClass3_Sub1_1;

	static {
		new Class267("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(IIIIILclient!ab;)V")
	public Class3_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub1 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static201.method3981(arg0, arg1));
		this.aClass3_Sub1_1 = arg5;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!eq;I)V")
	@Override
	public void method5937(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	@Override
	public void method5324() {
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)I")
	@Override
	public int method5327() {
		return 0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!eq;Z)V")
	@Override
	public void method5320(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLclient!eq;)V")
	@Override
	public void method5322(@OriginalArg(1) Class66 arg0) {
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Lclient!eq;Z)Lclient!gl;")
	@Override
	public Class57_Sub2 method5936(@OriginalArg(0) Class66 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!eq;Z)Lclient!va;")
	@Override
	public Class224 method5323(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)I")
	@Override
	public int method5325() {
		return 0;
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)I")
	@Override
	public int method5319() {
		return 0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5326() {
		return false;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!eq;BI)Z")
	@Override
	public boolean method5939(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
	@Override
	public int method5321() {
		return 0;
	}
}
