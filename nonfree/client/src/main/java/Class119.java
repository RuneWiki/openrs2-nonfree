import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class119 {

	@OriginalMember(owner = "client!it", name = "t", descriptor = "[B")
	public static final byte[] aByteArray29;

	@OriginalMember(owner = "client!it", name = "m", descriptor = "Lclient!vv;")
	private final Class261 aClass261_7 = new Class261();

	@OriginalMember(owner = "client!it", name = "e", descriptor = "I")
	private final int anInt3072;

	@OriginalMember(owner = "client!it", name = "c", descriptor = "I")
	private int anInt3070;

	@OriginalMember(owner = "client!it", name = "b", descriptor = "Lclient!ew;")
	private final Class72 aClass72_18;

	static {
		@Pc(7) int local7 = 0;
		aByteArray29 = new byte[32896];
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			for (@Pc(15) int local15 = 0; local15 <= local12; local15++) {
				aByteArray29[local7++] = (byte) (255.0D / Math.sqrt((double) ((float) (local15 * local15 + local12 * local12 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(I)V")
	public Class119(@OriginalArg(0) int arg0) {
		this.anInt3072 = arg0;
		this.anInt3070 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass72_18 = new Class72(local16);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)I")
	public int method2491() {
		return this.anInt3070;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)I")
	public int method2492() {
		return this.anInt3072;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)V")
	public void method2493() {
		if (Static233.aClass75_4 == null) {
			return;
		}
		for (@Pc(9) Class2_Sub5_Sub2 local9 = (Class2_Sub5_Sub2) this.aClass261_7.method5489(); local9 != null; local9 = (Class2_Sub5_Sub2) this.aClass261_7.method5490()) {
			if (local9.method2956()) {
				if (local9.method2955() == null) {
					local9.method5703();
					local9.method5621();
					this.anInt3070 += local9.anInt3676;
				}
			} else if ((long) 5 < ++local9.aLong220) {
				@Pc(31) Class2_Sub5_Sub2 local31 = Static233.aClass75_4.method1705(local9);
				this.aClass72_18.method1653(local31, local9.aLong225);
				Static46.method670(local9, local31);
				local9.method5703();
				local9.method5621();
			}
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILjava/lang/Object;ILclient!jo;)V")
	private void method2494(@OriginalArg(1) Object arg0, @OriginalArg(3) Interface7 arg1) {
		if (this.anInt3072 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2496(arg1);
		this.anInt3070--;
		while (this.anInt3070 < 0) {
			@Pc(36) Class2_Sub5_Sub2 local36 = (Class2_Sub5_Sub2) this.aClass261_7.method5485();
			this.method2495(local36);
		}
		@Pc(61) Class2_Sub5_Sub2_Sub2 local61 = new Class2_Sub5_Sub2_Sub2(arg1, arg0, 1);
		this.aClass72_18.method1653(local61, arg1.method2023());
		this.aClass261_7.method5487(local61);
		local61.aLong220 = 0L;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!nb;I)V")
	private void method2495(@OriginalArg(0) Class2_Sub5_Sub2 arg0) {
		if (arg0 != null) {
			arg0.method5703();
			arg0.method5621();
			this.anInt3070 += arg0.anInt3676;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!jo;Z)V")
	private void method2496(@OriginalArg(0) Interface7 arg0) {
		@Pc(9) long local9 = arg0.method2023();
		for (@Pc(20) Class2_Sub5_Sub2 local20 = (Class2_Sub5_Sub2) this.aClass72_18.method1659(local9); local20 != null; local20 = (Class2_Sub5_Sub2) this.aClass72_18.method1657()) {
			if (local20.anInterface7_3.method2022(arg0)) {
				this.method2495(local20);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
	public void method2498() {
		for (@Pc(11) Class2_Sub5_Sub2 local11 = (Class2_Sub5_Sub2) this.aClass261_7.method5489(); local11 != null; local11 = (Class2_Sub5_Sub2) this.aClass261_7.method5490()) {
			if (local11.method2956()) {
				local11.method5703();
				local11.method5621();
				this.anInt3070 += local11.anInt3676;
			}
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILclient!jo;)Ljava/lang/Object;")
	public Object method2499(@OriginalArg(1) Interface7 arg0) {
		@Pc(9) long local9 = arg0.method2023();
		for (@Pc(21) Class2_Sub5_Sub2 local21 = (Class2_Sub5_Sub2) this.aClass72_18.method1659(local9); local21 != null; local21 = (Class2_Sub5_Sub2) this.aClass72_18.method1657()) {
			if (local21.anInterface7_3.method2022(arg0)) {
				@Pc(33) Object local33 = local21.method2955();
				if (local33 != null) {
					if (local21.method2956()) {
						@Pc(62) Class2_Sub5_Sub2_Sub2 local62 = new Class2_Sub5_Sub2_Sub2(arg0, local33, local21.anInt3676);
						this.aClass72_18.method1653(local62, local21.aLong225);
						this.aClass261_7.method5487(local62);
						local62.aLong220 = 0L;
						local21.method5703();
						local21.method5621();
					} else {
						this.aClass261_7.method5487(local21);
						local21.aLong220 = 0L;
					}
					return local33;
				}
				local21.method5703();
				local21.method5621();
				this.anInt3070 += local21.anInt3676;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
	public void method2501() {
		this.aClass261_7.method5486();
		this.aClass72_18.method1650();
		this.anInt3070 = this.anInt3072;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILjava/lang/Object;Lclient!jo;)V")
	public void method2502(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface7 arg1) {
		this.method2494(arg0, arg1);
	}
}
