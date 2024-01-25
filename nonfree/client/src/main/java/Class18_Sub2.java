import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class18_Sub2 extends Class18 {

	@OriginalMember(owner = "client!cj", name = "x", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!gd;)V")
	public Class18_Sub2(@OriginalArg(0) Class65_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9000() {
		return true;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
	@Override
	public void method9003() {
		if (this.aBoolean87) {
			super.aClass65_Sub2_23.method4358(1);
			super.aClass65_Sub2_23.method4347(Static407.aClass162_4);
			super.aClass65_Sub2_23.method4432(Static606.aClass178_4, Static606.aClass178_4);
			super.aClass65_Sub2_23.method4400(Static413.aClass64_3, 2);
			super.aClass65_Sub2_23.method4369(0, Static536.aClass64_4);
			super.aClass65_Sub2_23.method4423();
			super.aClass65_Sub2_23.method4426((Interface25) null);
			super.aClass65_Sub2_23.method4358(0);
			this.aBoolean87 = false;
		} else {
			super.aClass65_Sub2_23.method4369(0, Static536.aClass64_4);
		}
		super.aClass65_Sub2_23.method4432(Static606.aClass178_4, Static606.aClass178_4);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!sfa;I)V")
	@Override
	public void method9006(@OriginalArg(0) int arg0, @OriginalArg(1) Interface25 arg1) {
		super.aClass65_Sub2_23.method4426(arg1);
		super.aClass65_Sub2_23.method4405(arg0);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9011(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface14 local8 = super.aClass65_Sub2_23.method4390();
		if (local8 == null || !arg0) {
			super.aClass65_Sub2_23.method4369(0, Static235.aClass64_2);
			return;
		}
		super.aClass65_Sub2_23.method4358(1);
		super.aClass65_Sub2_23.method4426(local8);
		super.aClass65_Sub2_23.method4347(Static122.aClass162_6);
		super.aClass65_Sub2_23.method4358(1);
		super.aClass65_Sub2_23.method4432(Static512.aClass178_3, Static138.aClass178_2);
		super.aClass65_Sub2_23.method4388(2, Static169.aClass64_1, true, false);
		super.aClass65_Sub2_23.method4369(0, Static235.aClass64_2);
		@Pc(68) Class254_Sub2 local68 = super.aClass65_Sub2_23.method4439();
		local68.method6232(super.aClass65_Sub2_23.method4472());
		super.aClass65_Sub2_23.method4411(Static581.aClass198_5);
		super.aClass65_Sub2_23.method4358(0);
		this.aBoolean87 = true;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BII)V")
	@Override
	public void method9012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9009(@OriginalArg(0) boolean arg0) {
		super.aClass65_Sub2_23.method4432(Static606.aClass178_4, Static138.aClass178_2);
	}
}
