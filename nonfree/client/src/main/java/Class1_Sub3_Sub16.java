import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public final class Class1_Sub3_Sub16 extends Class1_Sub3 {

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "I")
	public int anInt4242;

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
	public int anInt4243;

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
	public int anInt4246;

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
	public int anInt4247;

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
	public int anInt4249;

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
	public int anInt4252;

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "I")
	public int anInt4256;

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "I")
	public int anInt4257;

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "Lclient!je;")
	public Class86 aClass86_1;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!je;Lclient!dc;)V")
	public Class1_Sub3_Sub16(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class34_Sub1 arg1) {
		this.aClass86_1 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	public void method3114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4243 = arg2;
		this.anInt4247 = arg0;
		this.anInt4249 = arg1;
	}
}
