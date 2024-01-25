import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!gca", name = "j", descriptor = "J")
	public long aLong95;

	@OriginalMember(owner = "client!gca", name = "l", descriptor = "B")
	public byte aByte56;

	@OriginalMember(owner = "client!gca", name = "t", descriptor = "Z")
	private boolean aBoolean281;

	@OriginalMember(owner = "client!gca", name = "v", descriptor = "[Lclient!ica;")
	public Class170[] aClass170Array1;

	@OriginalMember(owner = "client!gca", name = "z", descriptor = "B")
	public byte aByte57;

	@OriginalMember(owner = "client!gca", name = "m", descriptor = "Ljava/lang/String;")
	public String aString43 = null;

	@OriginalMember(owner = "client!gca", name = "q", descriptor = "I")
	public int anInt3447 = 0;

	@OriginalMember(owner = "client!gca", name = "s", descriptor = "Z")
	private boolean aBoolean280 = true;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class3_Sub20(@OriginalArg(0) Class3_Sub17 arg0) {
		this.method3029(arg0);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)V")
	public void method3028(@OriginalArg(0) int arg0) {
		this.anInt3447--;
		if (this.anInt3447 == 0) {
			this.aClass170Array1 = null;
		} else {
			Static689.method8053(this.aClass170Array1, arg0 + 1, this.aClass170Array1, arg0, this.anInt3447 - arg0);
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZLclient!fca;)V")
	private void method3029(@OriginalArg(1) Class3_Sub17 arg0) {
		@Pc(9) int local9 = arg0.method4888();
		if ((local9 & 0x2) != 0) {
			this.aBoolean280 = true;
		}
		if ((local9 & 0x1) != 0) {
			this.aBoolean281 = true;
		}
		super.aLong309 = arg0.method4865();
		this.aLong95 = arg0.method4865();
		this.aString43 = arg0.method4847();
		arg0.method4888();
		this.aByte56 = arg0.method4861();
		this.aByte57 = arg0.method4861();
		this.anInt3447 = arg0.method4888();
		if (this.anInt3447 <= 0) {
			return;
		}
		this.aClass170Array1 = new Class170[this.anInt3447];
		for (@Pc(76) int local76 = 0; local76 < this.anInt3447; local76++) {
			@Pc(82) Class170 local82 = new Class170();
			if (this.aBoolean281) {
				arg0.method4865();
			}
			if (this.aBoolean280) {
				local82.aString55 = arg0.method4847();
			}
			local82.aByte66 = arg0.method4861();
			local82.anInt4576 = arg0.method4858();
			this.aClass170Array1[local76] = local82;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method3031(@OriginalArg(0) String arg0) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt3447; local13++) {
			if (this.aClass170Array1[local13].aString55.equalsIgnoreCase(arg0)) {
				return local13;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IB)V")
	private void method3034(@OriginalArg(0) int arg0) {
		if (this.aClass170Array1 == null) {
			this.aClass170Array1 = new Class170[arg0];
		} else {
			Static689.method8053(this.aClass170Array1, 0, this.aClass170Array1 = new Class170[arg0], 0, this.anInt3447);
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!ica;)V")
	public void method3035(@OriginalArg(1) Class170 arg0) {
		if (this.aClass170Array1 == null || this.aClass170Array1.length <= this.anInt3447) {
			this.method3034(this.anInt3447 + 5);
		}
		this.aClass170Array1[this.anInt3447++] = arg0;
	}
}
