import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class10_Sub8_Sub2 extends Class10_Sub8 {

	@OriginalMember(owner = "client!ha", name = "Jb", descriptor = "Lclient!ib;")
	private Class115 aClass115_1;

	@OriginalMember(owner = "client!ha", name = "Mb", descriptor = "I")
	private int anInt3028;

	static {
		new Class182(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(I)V")
	public Class10_Sub8_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "(B)Z")
	public boolean method2524() {
		@Pc(22) int local22 = super.aByteArray44[super.anInt2989] - this.aClass115_1.method2774() & 0xFF;
		return local22 >= 128;
	}

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "(II)I")
	public int method2525(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt3028 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt3028 & 0x7);
		this.anInt3028 += arg0;
		@Pc(26) int local26 = 0;
		while (local18 < arg0) {
			local26 += (super.aByteArray44[local10++] & Static72.anIntArray111[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local26 += Static72.anIntArray111[local18] & super.aByteArray44[local10];
		} else {
			local26 += super.aByteArray44[local10] >> local18 - arg0 & Static72.anIntArray111[arg0];
		}
		return local26;
	}

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "(II)I")
	public int method2526(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3028;
	}

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "(I)V")
	public void method2528() {
		super.anInt2989 = (this.anInt3028 + 7) / 8;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([BIZI)V")
	public void method2529(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (super.aByteArray44[super.anInt2989++] - this.aClass115_1.method2778());
		}
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(BI)V")
	public void method2530(@OriginalArg(1) int arg0) {
		super.aByteArray44[super.anInt2989++] = (byte) (this.aClass115_1.method2778() + arg0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[I)V")
	public void method2531(@OriginalArg(1) int[] arg0) {
		this.aClass115_1 = new Class115(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "(I)V")
	public void method2532() {
		this.anInt3028 = super.anInt2989 * 8;
	}

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "(B)I")
	public int method2533() {
		@Pc(22) int local22 = super.aByteArray44[super.anInt2989++] - this.aClass115_1.method2778() & 0xFF;
		return local22 < 128 ? local22 : (local22 - 128 << 8) + (super.aByteArray44[super.anInt2989++] - this.aClass115_1.method2778() & 0xFF);
	}
}
