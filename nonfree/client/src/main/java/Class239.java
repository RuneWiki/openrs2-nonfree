import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class239 {

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!dr;")
	private final Class80 aClass80_4 = new Class80();

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
	private final int anInt6533;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
	private int anInt6518;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!du;")
	private final Class81 aClass81_50;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I)V")
	public Class239(@OriginalArg(0) int arg0) {
		this.anInt6533 = arg0;
		this.anInt6518 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass81_50 = new Class81(local16);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public void method5767() {
		for (@Pc(20) Class5_Sub4_Sub16 local20 = (Class5_Sub4_Sub16) this.aClass80_4.method1538(); local20 != null; local20 = (Class5_Sub4_Sub16) this.aClass80_4.method1536()) {
			if (local20.method8275()) {
				local20.method8911();
				local20.method8741();
				this.anInt6518 += local20.anInt9639;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	public void method5769() {
		this.aClass80_4.method1542();
		this.aClass81_50.method1602();
		this.anInt6518 = this.anInt6533;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V")
	public void method5770() {
		if (Static342.aClass150_1 == null) {
			return;
		}
		for (@Pc(17) Class5_Sub4_Sub16 local17 = (Class5_Sub4_Sub16) this.aClass80_4.method1538(); local17 != null; local17 = (Class5_Sub4_Sub16) this.aClass80_4.method1536()) {
			if (local17.method8275()) {
				if (local17.method8271() == null) {
					local17.method8911();
					local17.method8741();
					this.anInt6518 += local17.anInt9639;
				}
			} else if (++local17.aLong273 > (long) 5) {
				@Pc(64) Class5_Sub4_Sub16 local64 = Static342.aClass150_1.method3570(local17);
				this.aClass81_50.method1607(local64, local17.aLong282);
				Static130.method1928(local17, local64);
				local17.method8911();
				local17.method8741();
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLclient!ek;)V")
	private void method5772(@OriginalArg(1) Interface11 arg0) {
		@Pc(9) long local9 = arg0.method1738();
		for (@Pc(22) Class5_Sub4_Sub16 local22 = (Class5_Sub4_Sub16) this.aClass81_50.method1599(local9); local22 != null; local22 = (Class5_Sub4_Sub16) this.aClass81_50.method1605()) {
			if (local22.anInterface11_3.method1737(arg0)) {
				this.method5773(local22);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!rba;B)V")
	private void method5773(@OriginalArg(0) Class5_Sub4_Sub16 arg0) {
		if (arg0 != null) {
			arg0.method8911();
			arg0.method8741();
			this.anInt6518 += arg0.anInt9639;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)I")
	public int method5775() {
		return this.anInt6533;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(BLclient!ek;)Ljava/lang/Object;")
	public Object method5776(@OriginalArg(1) Interface11 arg0) {
		@Pc(9) long local9 = arg0.method1738();
		for (@Pc(16) Class5_Sub4_Sub16 local16 = (Class5_Sub4_Sub16) this.aClass81_50.method1599(local9); local16 != null; local16 = (Class5_Sub4_Sub16) this.aClass81_50.method1605()) {
			if (local16.anInterface11_3.method1737(arg0)) {
				@Pc(28) Object local28 = local16.method8271();
				if (local28 != null) {
					if (local16.method8275()) {
						@Pc(57) Class5_Sub4_Sub16_Sub1 local57 = new Class5_Sub4_Sub16_Sub1(arg0, local28, local16.anInt9639);
						this.aClass81_50.method1607(local57, local16.aLong282);
						this.aClass80_4.method1537(local57);
						local57.aLong273 = 0L;
						local16.method8911();
						local16.method8741();
					} else {
						this.aClass80_4.method1537(local16);
						local16.aLong273 = 0L;
					}
					return local28;
				}
				local16.method8911();
				local16.method8741();
				this.anInt6518 += local16.anInt9639;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)I")
	public int method5777() {
		return this.anInt6518;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILjava/lang/Object;Lclient!ek;)V")
	private void method5778(@OriginalArg(2) Object arg0, @OriginalArg(3) Interface11 arg1) {
		if (this.anInt6533 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method5772(arg1);
		this.anInt6518--;
		while (this.anInt6518 < 0) {
			@Pc(36) Class5_Sub4_Sub16 local36 = (Class5_Sub4_Sub16) this.aClass80_4.method1543();
			this.method5773(local36);
		}
		@Pc(53) Class5_Sub4_Sub16_Sub1 local53 = new Class5_Sub4_Sub16_Sub1(arg1, arg0, 1);
		this.aClass81_50.method1607(local53, arg1.method1738());
		this.aClass80_4.method1537(local53);
		local53.aLong273 = 0L;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLjava/lang/Object;Lclient!ek;)V")
	public void method5779(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface11 arg1) {
		this.method5778(arg0, arg1);
	}
}
