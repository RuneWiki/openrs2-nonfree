import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class210_Sub3 extends Class210 {

	@OriginalMember(owner = "client!te", name = "A", descriptor = "Lclient!f;")
	private Class39 aClass39_34;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!pl;Lclient!pl;Lclient!bw;)V")
	public Class210_Sub3(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class9_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	@Override
	public void method7014() {
		super.method7014();
		this.aClass39_34 = Static152.method2474(super.aClass259_156, ((Class9_Sub2) super.aClass9_5).anInt1171);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IIZI)V")
	@Override
	protected void method7020(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method7022() * super.aClass9_5.anInt5034 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static307.aClass100_6.oa(local16);
		Static307.aClass100_6.da(arg1, arg0 + 2, arg1 + local13, super.aClass9_5.anInt5030 + arg0);
		this.aClass39_34.method7860(arg1, arg0 + 2, super.aClass9_5.anInt5034, super.aClass9_5.anInt5030);
		Static307.aClass100_6.da(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7015() {
		return super.method7015() ? super.aClass259_156.method5988(((Class9_Sub2) super.aClass9_5).anInt1171) : false;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method7019(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static307.aClass100_6.method6212(arg0 - 2, arg1, super.aClass9_5.anInt5034 + 4, super.aClass9_5.anInt5030 + 2, ((Class9_Sub2) super.aClass9_5).anInt1173, 0);
		Static307.aClass100_6.method6212(arg0 - 1, arg1 + 1, super.aClass9_5.anInt5034 + 2, super.aClass9_5.anInt5030, 0, 0);
	}
}
