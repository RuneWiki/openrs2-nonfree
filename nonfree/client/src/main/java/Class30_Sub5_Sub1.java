import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class30_Sub5_Sub1 extends Class30_Sub5 {

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
	public int anInt5615;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
	public int anInt5617;

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "I")
	public int anInt5618;

	@OriginalMember(owner = "client!ls", name = "D", descriptor = "I")
	public int anInt5627;

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
	public int anInt5619 = -1;

	@OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
	public int anInt5625 = -1;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(ZLclient!qa;)Lclient!vw;")
	@Override
	public Class7_Sub8 method7908(@OriginalArg(1) Class42 arg0) {
		@Pc(6) Class91 local6 = arg0.method5847();
		local6.oa(super.anInt5611, super.anInt5609, super.anInt5608);
		@Pc(18) Class7_Sub8 local18 = Static196.method3703(3);
		@Pc(40) Class26 local40;
		if (this.anInt5619 != -1) {
			local40 = Static150.aClass254_2.method6340(this.anInt5619).method1567(2048, 0, this.anInt5615, -1, null, arg0, 0, null);
			if (local40 != null) {
				local40.method8003(local6, local18.aClass7_Sub4Array1[2], 0);
			}
		}
		if (this.anInt5625 != -1) {
			local40 = Static150.aClass254_2.method6340(this.anInt5625).method1567(2048, 0, this.anInt5618, -1, null, arg0, 0, null);
			if (local40 != null) {
				local40.method8003(local6, local18.aClass7_Sub4Array1[1], 0);
			}
		}
		local40 = Static150.aClass254_2.method6340(this.anInt5627).method1567(2048, 0, this.anInt5617, -1, null, arg0, 0, null);
		if (local40 != null) {
			local40.method8003(local6, local18.aClass7_Sub4Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7903(@OriginalArg(0) Class42 arg0) {
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLclient!qa;)Lclient!nk;")
	@Override
	public Class218 method7906(@OriginalArg(1) Class42 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method7907(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class91 local14 = arg0.method5847();
		local14.oa(super.anInt5611, super.anInt5609, super.anInt5608);
		@Pc(39) Class26 local39 = Static150.aClass254_2.method6340(this.anInt5627).method1567(131072, 0, this.anInt5617, -1, null, arg0, 0, null);
		if (local39 != null && local39.method8005(arg1, arg2, local14, true)) {
			return true;
		}
		if (this.anInt5625 != -1) {
			local39 = Static150.aClass254_2.method6340(this.anInt5625).method1567(131072, 0, this.anInt5618, -1, null, arg0, 0, null);
			if (local39 != null && local39.method8005(arg1, arg2, local14, true)) {
				return true;
			}
		}
		if (this.anInt5619 != -1) {
			local39 = Static150.aClass254_2.method6340(this.anInt5619).method1567(131072, 0, this.anInt5615, -1, null, arg0, 0, null);
			if (local39 != null && local39.method8005(arg1, arg2, local14, true)) {
				return true;
			}
		}
		return false;
	}
}
