import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class74 {

	@OriginalMember(owner = "client!eaa", name = "h", descriptor = "Lclient!fc;")
	private final Class94 aClass94_13 = new Class94(16);

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "Lclient!ni;")
	private final Class223 aClass223_39;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;)V")
	public Class74(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_39 = arg2;
		this.aClass223_39.method5970(29);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
	public void method2526() {
		@Pc(6) Class94 local6 = this.aClass94_13;
		synchronized (this.aClass94_13) {
			this.aClass94_13.method2964();
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IB)Lclient!eba;")
	private Class75 method2528(@OriginalArg(0) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_13;
		@Pc(16) Class75 local16;
		synchronized (this.aClass94_13) {
			local16 = (Class75) this.aClass94_13.method2960((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class223 local34 = this.aClass223_39;
		@Pc(43) byte[] local43;
		synchronized (this.aClass223_39) {
			local43 = this.aClass223_39.method5954(arg0, 29);
		}
		local16 = new Class75();
		if (local43 != null) {
			local16.method2553(new Class6_Sub8(local43));
		}
		@Pc(65) Class94 local65 = this.aClass94_13;
		synchronized (this.aClass94_13) {
			this.aClass94_13.method2963((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIIILclient!hh;I)Lclient!vaa;")
	public Class350 method2529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class132 arg3, @OriginalArg(5) int arg4) {
		@Pc(11) Class189[] local11 = null;
		@Pc(16) Class75 local16 = this.method2528(arg0);
		if (local16.anIntArray112 != null) {
			local11 = new Class189[local16.anIntArray112.length];
			for (@Pc(26) int local26 = 0; local26 < local11.length; local26++) {
				@Pc(36) Class280 local36 = arg3.method3810(local16.anIntArray112[local26]);
				local11[local26] = new Class189(local36.anInt8350, local36.anInt8351, local36.anInt8348, local36.anInt8346, local36.anInt8345, local36.anInt8344, local36.anInt8349, local36.aBoolean666);
			}
		}
		return new Class350(local16.anInt3019, local11, local16.anInt3020, arg2, arg1, arg4);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V")
	public void method2530() {
		@Pc(2) Class94 local2 = this.aClass94_13;
		synchronized (this.aClass94_13) {
			this.aClass94_13.method2952();
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI)V")
	public void method2531() {
		@Pc(18) Class94 local18 = this.aClass94_13;
		synchronized (this.aClass94_13) {
			this.aClass94_13.method2958(5);
		}
	}
}
