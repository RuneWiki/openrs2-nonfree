import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class2_Sub5_Sub16 extends Class2_Sub5 {

	@OriginalMember(owner = "client!ss", name = "z", descriptor = "Lclient!mn;")
	private Class163 aClass163_39;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLclient!si;I)V")
	private void method5009(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(14) int local14 = arg0.method5495();
		@Pc(21) int local21;
		if (this.aClass163_39 == null) {
			local21 = Static51.method863(local14);
			this.aClass163_39 = new Class163(local21);
		}
		for (local21 = 0; local21 < local14; local21++) {
			@Pc(42) boolean local42 = arg0.method5495() == 1;
			@Pc(46) int local46 = arg0.method5485();
			@Pc(55) Class2 local55;
			if (local42) {
				local55 = new Class2_Sub4(arg0.method5494());
			} else {
				local55 = new Class2_Sub26(arg0.method5508());
			}
			this.aClass163_39.method3764((long) local46, local55);
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILclient!si;)V")
	public void method5011(@OriginalArg(1) Class2_Sub23 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5495();
			if (local9 == 0) {
				return;
			}
			this.method5009(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IBI)I")
	public int method5013(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass163_39 == null) {
			return arg1;
		} else {
			@Pc(21) Class2_Sub26 local21 = (Class2_Sub26) this.aClass163_39.method3769((long) arg0);
			return local21 == null ? arg1 : local21.anInt4485;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method5014(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass163_39 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub4 local16 = (Class2_Sub4) this.aClass163_39.method3769((long) arg0);
			return local16 == null ? arg1 : local16.aString2;
		}
	}
}
