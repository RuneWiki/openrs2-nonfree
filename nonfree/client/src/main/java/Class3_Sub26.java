import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class3_Sub26 extends Class3 {

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "J")
	public long aLong113;

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "Z")
	private boolean aBoolean279;

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "[Lclient!dha;")
	public Class78[] aClass78Array1;

	@OriginalMember(owner = "client!hr", name = "x", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!hr", name = "A", descriptor = "B")
	public byte aByte65;

	@OriginalMember(owner = "client!hr", name = "F", descriptor = "B")
	public byte aByte66;

	@OriginalMember(owner = "client!hr", name = "v", descriptor = "Z")
	private boolean aBoolean280 = true;

	@OriginalMember(owner = "client!hr", name = "u", descriptor = "Ljava/lang/String;")
	public String aString53 = null;

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
	public int anInt4134 = 0;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!dt;)V")
	public Class3_Sub26(@OriginalArg(0) Class3_Sub4 arg0) {
		this.method3523(arg0);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLclient!dha;)V")
	public void method3516(@OriginalArg(1) Class78 arg0) {
		if (this.aClass78Array1 == null || this.aClass78Array1.length <= this.anInt4134) {
			this.method3522(this.anInt4134 + 5);
		}
		this.aClass78Array1[this.anInt4134++] = arg0;
		this.anIntArray248 = null;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method3519(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4134; local7++) {
			if (this.aClass78Array1[local7].aString30.equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)[I")
	public int[] method3520() {
		if (this.anIntArray248 == null) {
			this.anIntArray248 = new int[this.anInt4134];
			@Pc(17) String[] local17 = new String[this.anInt4134];
			@Pc(19) int local19 = 0;
			while (this.anInt4134 > local19) {
				local17[local19] = this.aClass78Array1[local19].aString30;
				this.anIntArray248[local19] = local19++;
			}
			Static304.method4417(local17, this.anIntArray248);
		}
		return this.anIntArray248;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)V")
	private void method3522(@OriginalArg(1) int arg0) {
		if (this.aClass78Array1 == null) {
			this.aClass78Array1 = new Class78[arg0];
		} else {
			Static681.method4033(this.aClass78Array1, 0, this.aClass78Array1 = new Class78[arg0], 0, this.anInt4134);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZLclient!dt;)V")
	private void method3523(@OriginalArg(1) Class3_Sub4 arg0) {
		@Pc(9) int local9 = arg0.method7954();
		if ((local9 & 0x1) != 0) {
			this.aBoolean279 = true;
		}
		if ((local9 & 0x2) != 0) {
			this.aBoolean280 = true;
		}
		super.aLong313 = arg0.method7946();
		this.aLong113 = arg0.method7946();
		this.aString53 = arg0.method7922();
		arg0.method7954();
		this.aByte66 = arg0.method7960();
		this.aByte65 = arg0.method7960();
		this.anInt4134 = arg0.method7951();
		if (this.anInt4134 <= 0) {
			return;
		}
		this.aClass78Array1 = new Class78[this.anInt4134];
		for (@Pc(81) int local81 = 0; local81 < this.anInt4134; local81++) {
			@Pc(87) Class78 local87 = new Class78();
			if (this.aBoolean279) {
				arg0.method7946();
			}
			if (this.aBoolean280) {
				local87.aString30 = arg0.method7922();
			}
			local87.aByte39 = arg0.method7960();
			local87.anInt2026 = arg0.method7951();
			this.aClass78Array1[local81] = local87;
		}
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)V")
	public void method3524(@OriginalArg(1) int arg0) {
		this.anInt4134--;
		if (this.anInt4134 == 0) {
			this.aClass78Array1 = null;
		} else {
			Static681.method4033(this.aClass78Array1, arg0 + 1, this.aClass78Array1, arg0, this.anInt4134 - arg0);
		}
		this.anIntArray248 = null;
	}
}
