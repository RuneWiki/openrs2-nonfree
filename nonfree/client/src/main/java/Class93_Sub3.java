import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class93_Sub3 extends Class93 {

	@OriginalMember(owner = "client!wn", name = "w", descriptor = "Lclient!ug;")
	private Class43 aClass43_34;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!nca;Lclient!nca;Lclient!ge;)V")
	public Class93_Sub3(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class33_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method9565(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static396.aClass145_6.method9713(arg1 - 2, arg0, super.aClass33_5.anInt7246 + 4, super.aClass33_5.anInt7251 - -2, ((Class33_Sub3) super.aClass33_5).anInt3250, 0);
		Static396.aClass145_6.method9713(arg1 - 1, arg0 + 1, super.aClass33_5.anInt7246 + 2, super.aClass33_5.anInt7251, 0, 0);
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(IZII)V")
	@Override
	protected void method9568(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method9563() * super.aClass33_5.anInt7246 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static396.aClass145_6.K(local16);
		Static396.aClass145_6.KA(arg0, arg1 + 2, arg0 - -local13, super.aClass33_5.anInt7251 + arg1);
		this.aClass43_34.method9605(arg0, arg1 + 2, super.aClass33_5.anInt7246, super.aClass33_5.anInt7251);
		Static396.aClass145_6.KA(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V")
	@Override
	public void method9561() {
		super.method9561();
		this.aClass43_34 = Static551.method6202(super.aClass254_171, ((Class33_Sub3) super.aClass33_5).anInt3254);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9562() {
		return super.method9562() ? super.aClass254_171.method6072(((Class33_Sub3) super.aClass33_5).anInt3254) : false;
	}
}
