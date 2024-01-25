import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class180 {

	@OriginalMember(owner = "client!om", name = "b", descriptor = "Lclient!ka;")
	private final Class132 aClass132_42 = new Class132(16);

	@OriginalMember(owner = "client!om", name = "k", descriptor = "Lclient!dk;")
	private final Class54 aClass54_80;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;)V")
	public Class180(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2) {
		this.aClass54_80 = arg2;
		this.aClass54_80.method1123(29);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)V")
	public void method3844() {
		@Pc(10) Class132 local10 = this.aClass132_42;
		synchronized (this.aClass132_42) {
			this.aClass132_42.method2713(5);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	public void method3849() {
		@Pc(2) Class132 local2 = this.aClass132_42;
		synchronized (this.aClass132_42) {
			this.aClass132_42.method2708();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIILclient!jq;II)Lclient!mh;")
	public Class157 method3851(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class129 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class26[] local7 = null;
		@Pc(18) Class172 local18 = this.method3852(arg3);
		if (local18.anIntArray378 != null) {
			local7 = new Class26[local18.anIntArray378.length];
			for (@Pc(28) int local28 = 0; local28 < local7.length; local28++) {
				@Pc(38) Class30 local38 = arg2.method2649(local18.anIntArray378[local28]);
				local7[local28] = new Class26(local38.anInt792, local38.anInt804, local38.anInt800, local38.anInt803, local38.anInt802, local38.anInt799, local38.anInt794, local38.aBoolean71);
			}
		}
		return new Class157(local18.anInt4448, local7, local18.anInt4446, arg1, arg0, arg4);
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(II)Lclient!np;")
	private Class172 method3852(@OriginalArg(0) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_42;
		@Pc(16) Class172 local16;
		synchronized (this.aClass132_42) {
			local16 = (Class172) this.aClass132_42.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class54 local29 = this.aClass54_80;
		@Pc(38) byte[] local38;
		synchronized (this.aClass54_80) {
			local38 = this.aClass54_80.method1126(29, arg0);
		}
		local16 = new Class172();
		if (local38 != null) {
			local16.method3662(new Class2_Sub13(local38));
		}
		@Pc(60) Class132 local60 = this.aClass132_42;
		synchronized (this.aClass132_42) {
			this.aClass132_42.method2711(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	public void method3854() {
		@Pc(6) Class132 local6 = this.aClass132_42;
		synchronized (this.aClass132_42) {
			this.aClass132_42.method2698();
		}
	}
}
