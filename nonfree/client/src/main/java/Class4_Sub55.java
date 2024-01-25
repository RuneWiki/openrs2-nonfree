import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class4_Sub55 extends Class4 {

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "[I")
	private int[] anIntArray726;

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "[Lclient!tw;")
	public Class357[] aClass357Array1;

	@OriginalMember(owner = "client!wt", name = "q", descriptor = "J")
	public long aLong304;

	@OriginalMember(owner = "client!wt", name = "t", descriptor = "Z")
	private boolean aBoolean802;

	@OriginalMember(owner = "client!wt", name = "x", descriptor = "B")
	public byte aByte149;

	@OriginalMember(owner = "client!wt", name = "A", descriptor = "B")
	public byte aByte150;

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "Ljava/lang/String;")
	public String aString124 = null;

	@OriginalMember(owner = "client!wt", name = "r", descriptor = "I")
	public int anInt10602 = 0;

	@OriginalMember(owner = "client!wt", name = "z", descriptor = "Z")
	private boolean aBoolean803 = true;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class4_Sub55(@OriginalArg(0) Class4_Sub11 arg0) {
		this.method8972(arg0);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method8965(@OriginalArg(0) String arg0) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt10602; local13++) {
			if (this.aClass357Array1[local13].aString111.equalsIgnoreCase(arg0)) {
				return local13;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)[I")
	public int[] method8967() {
		if (this.anIntArray726 == null) {
			this.anIntArray726 = new int[this.anInt10602];
			@Pc(13) String[] local13 = new String[this.anInt10602];
			@Pc(15) int local15 = 0;
			while (this.anInt10602 > local15) {
				local13[local15] = this.aClass357Array1[local15].aString111;
				this.anIntArray726[local15] = local15++;
			}
			Static46.method827(local13, this.anIntArray726);
		}
		return this.anIntArray726;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IB)V")
	public void method8968(@OriginalArg(0) int arg0) {
		this.anInt10602--;
		if (this.anInt10602 == 0) {
			this.aClass357Array1 = null;
		} else {
			Static685.method6469(this.aClass357Array1, arg0 + 1, this.aClass357Array1, arg0, this.anInt10602 - arg0);
		}
		this.anIntArray726 = null;
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)V")
	private void method8969(@OriginalArg(1) int arg0) {
		if (this.aClass357Array1 == null) {
			this.aClass357Array1 = new Class357[arg0];
		} else {
			Static685.method6469(this.aClass357Array1, 0, this.aClass357Array1 = new Class357[arg0], 0, this.anInt10602);
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!tw;I)V")
	public void method8970(@OriginalArg(0) Class357 arg0) {
		if (this.aClass357Array1 == null || this.aClass357Array1.length <= this.anInt10602) {
			this.method8969(this.anInt10602 + 5);
		}
		this.aClass357Array1[this.anInt10602++] = arg0;
		this.anIntArray726 = null;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!es;I)V")
	private void method8972(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(9) int local9 = arg0.method8865();
		if ((local9 & 0x1) != 0) {
			this.aBoolean802 = true;
		}
		if ((local9 & 0x2) != 0) {
			this.aBoolean803 = true;
		}
		super.aLong307 = arg0.method8830();
		this.aLong304 = arg0.method8830();
		this.aString124 = arg0.method8853();
		arg0.method8865();
		this.aByte149 = arg0.method8861();
		this.aByte150 = arg0.method8861();
		this.anInt10602 = arg0.method8859();
		if (this.anInt10602 <= 0) {
			return;
		}
		this.aClass357Array1 = new Class357[this.anInt10602];
		for (@Pc(70) int local70 = 0; local70 < this.anInt10602; local70++) {
			@Pc(76) Class357 local76 = new Class357();
			if (this.aBoolean802) {
				arg0.method8830();
			}
			if (this.aBoolean803) {
				local76.aString111 = arg0.method8853();
			}
			local76.aByte136 = arg0.method8861();
			local76.anInt9106 = arg0.method8859();
			this.aClass357Array1[local70] = local76;
		}
	}
}
