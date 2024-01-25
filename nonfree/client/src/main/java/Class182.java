import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kea")
public final class Class182 {

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "Lclient!aj;")
	private final Class10 aClass10_25 = new Class10(16);

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "Lclient!om;")
	private final Class246 aClass246_127;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;)V")
	public Class182(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_127 = arg2;
		this.aClass246_127.method5673(29);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IB)Lclient!pa;")
	private Class253 method4390(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_25;
		@Pc(16) Class253 local16;
		synchronized (this.aClass10_25) {
			local16 = (Class253) this.aClass10_25.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_127;
		@Pc(38) byte[] local38;
		synchronized (this.aClass246_127) {
			local38 = this.aClass246_127.method5653(29, arg0);
		}
		local16 = new Class253();
		if (local38 != null) {
			local16.method5755(new Class3_Sub11(local38));
		}
		@Pc(60) Class10 local60 = this.aClass10_25;
		synchronized (this.aClass10_25) {
			this.aClass10_25.method254(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIILclient!vfa;)Lclient!of;")
	public Class242 method4391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class349 arg4) {
		@Pc(7) Class30[] local7 = null;
		@Pc(18) Class253 local18 = this.method4390(arg3);
		if (local18.anIntArray539 != null) {
			local7 = new Class30[local18.anIntArray539.length];
			for (@Pc(28) int local28 = 0; local28 < local7.length; local28++) {
				@Pc(38) Class86 local38 = arg4.method7443(local18.anIntArray539[local28]);
				local7[local28] = new Class30(local38.anInt2816, local38.anInt2811, local38.anInt2818, local38.anInt2808, local38.anInt2809, local38.anInt2810, local38.anInt2815, local38.aBoolean240);
			}
		}
		return new Class242(local18.anInt6734, local7, local18.anInt6730, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)V")
	public void method4392() {
		@Pc(8) Class10 local8 = this.aClass10_25;
		synchronized (this.aClass10_25) {
			this.aClass10_25.method262();
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)V")
	public void method4393() {
		@Pc(2) Class10 local2 = this.aClass10_25;
		synchronized (this.aClass10_25) {
			this.aClass10_25.method258(5);
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V")
	public void method4394() {
		@Pc(2) Class10 local2 = this.aClass10_25;
		synchronized (this.aClass10_25) {
			this.aClass10_25.method263();
		}
	}
}
