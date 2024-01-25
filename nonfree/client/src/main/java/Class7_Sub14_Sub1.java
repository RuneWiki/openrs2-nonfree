import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class7_Sub14_Sub1 extends Class7_Sub14 {

	@OriginalMember(owner = "client!dr", name = "Gb", descriptor = "I")
	private int anInt1562;

	@OriginalMember(owner = "client!dr", name = "Jb", descriptor = "Lclient!fi;")
	private Class79 aClass79_1;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(I)V")
	public Class7_Sub14_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "(Z)I")
	public int method1350() {
		@Pc(26) int local26 = super.aByteArray75[super.anInt4989++] - this.aClass79_1.method1927() & 0xFF;
		return local26 < 128 ? local26 : (super.aByteArray75[super.anInt4989++] - this.aClass79_1.method1927() & 0xFF) + (local26 - 128 << 8);
	}

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "(II)I")
	public int method1351(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt1562;
	}

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "(I)V")
	public void method1353() {
		super.anInt4989 = (this.anInt1562 + 7) / 8;
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(ZI)V")
	public void method1354(@OriginalArg(1) int arg0) {
		super.aByteArray75[super.anInt4989++] = (byte) (arg0 + this.aClass79_1.method1927());
	}

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "(Z)Z")
	public boolean method1355() {
		@Pc(21) int local21 = super.aByteArray75[super.anInt4989] - this.aClass79_1.method1934() & 0xFF;
		return local21 >= 128;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([BIIZ)V")
	public void method1357(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = (byte) (super.aByteArray75[super.anInt4989++] - this.aClass79_1.method1927());
		}
	}

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "(II)I")
	public int method1358(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = this.anInt1562 >> 3;
		@Pc(25) int local25 = 8 - (this.anInt1562 & 0x7);
		@Pc(27) int local27 = 0;
		this.anInt1562 += arg0;
		while (arg0 > local25) {
			local27 += (super.aByteArray75[local17++] & Static405.anIntArray466[local25]) << arg0 - local25;
			arg0 -= local25;
			local25 = 8;
		}
		if (arg0 == local25) {
			local27 += super.aByteArray75[local17] & Static405.anIntArray466[local25];
		} else {
			local27 += super.aByteArray75[local17] >> local25 - arg0 & Static405.anIntArray466[arg0];
		}
		return local27;
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(B[I)V")
	public void method1360(@OriginalArg(1) int[] arg0) {
		this.aClass79_1 = new Class79(arg0);
	}

	@OriginalMember(owner = "client!dr", name = "q", descriptor = "(I)V")
	public void method1361() {
		this.anInt1562 = super.anInt4989 * 8;
	}
}
