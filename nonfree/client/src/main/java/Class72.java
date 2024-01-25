import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class72 implements Interface12 {

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "[B")
	public static final byte[] aByteArray30;

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "Lclient!r;")
	private Class162 aClass162_6;

	@OriginalMember(owner = "client!dda", name = "k", descriptor = "Z")
	private boolean aBoolean95;

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "Lclient!gl;")
	private final Class125 aClass125_1;

	@OriginalMember(owner = "client!dda", name = "o", descriptor = "[Lclient!jt;")
	private final Interface16[] anInterface16Array1;

	static {
		@Pc(1) int local1 = 0;
		aByteArray30 = new byte[32896];
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray30[local1++] = (byte) (255.0D / Math.sqrt((double) ((float) (local9 * local9 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!gl;Lclient!ja;)V")
	public Class72(@OriginalArg(0) Class125 arg0, @OriginalArg(1) Class170 arg1) {
		this.aClass125_1 = arg0;
		this.anInterface16Array1 = new Interface16[this.aClass125_1.anInterface17Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface16Array1.length; local15++) {
			this.anInterface16Array1[local15] = arg1.method3441(this.aClass125_1.anInterface17Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method2483(@OriginalArg(0) boolean arg0) {
		@Pc(10) Interface16[] local10 = this.anInterface16Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface16 local18 = local10[local12];
			if (local18 != null) {
				local18.method7259();
			}
		}
		this.aBoolean95 = false;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZJ)Z")
	@Override
	public boolean method2486(@OriginalArg(1) long arg0) {
		return arg0 + (long) this.aClass125_1.anInt2647 <= Static362.method5133();
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)V")
	@Override
	public void method2484() {
		if (Static417.aClass162_17 != this.aClass162_6) {
			this.aBoolean95 = true;
			this.aClass162_6 = Static417.aClass162_17;
		}
		this.aClass162_6.ja(0);
		@Pc(22) Interface16[] local22 = this.anInterface16Array1;
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(38) Interface16 local38 = local22[local24];
			if (local38 != null) {
				local38.method7258();
			}
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)I")
	@Override
	public int method2485() {
		return this.aClass125_1.anInt2651;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)I")
	@Override
	public int method2482() {
		@Pc(7) int local7 = 0;
		@Pc(18) Interface16[] local18 = this.anInterface16Array1;
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Interface16 local26 = local18[local20];
			if (local26 == null || local26.method7257()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface16Array1.length;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)V")
	@Override
	public void method2487() {
	}
}
