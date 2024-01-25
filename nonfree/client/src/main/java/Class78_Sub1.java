import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!dq", name = "D", descriptor = "I")
	private int anInt2038;

	@OriginalMember(owner = "client!dq", name = "G", descriptor = "[I")
	private int[] anIntArray104;

	@OriginalMember(owner = "client!dq", name = "P", descriptor = "[[B")
	private final byte[][] aByteArrayArray10 = new byte[10][];

	@OriginalMember(owner = "client!dq", name = "C", descriptor = "Lclient!ol;")
	private final Class2_Sub8 aClass2_Sub8_1 = new Class2_Sub8((byte[]) null);

	@OriginalMember(owner = "client!dq", name = "S", descriptor = "Lclient!ol;")
	private final Class2_Sub8 aClass2_Sub8_2 = new Class2_Sub8((byte[]) null);

	@OriginalMember(owner = "client!dq", name = "F", descriptor = "Lclient!gga;")
	private final Class124 aClass124_29;

	@OriginalMember(owner = "client!dq", name = "N", descriptor = "I")
	private final int anInt2043;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(ILclient!gga;I)V")
	public Class78_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.aClass124_29 = arg1;
		this.anInt2043 = arg2;
	}

	@OriginalMember(owner = "client!dq", name = "i", descriptor = "(I)V")
	public void method2009() {
		if (this.anIntArray104 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
			if (this.anIntArray104.length <= this.anInt2038 + local11) {
				return;
			}
			if (this.aByteArrayArray10[local11] == null && this.aClass124_29.method3609(this.anIntArray104[local11 + this.anInt2038], 0)) {
				this.aByteArrayArray10[local11] = this.aClass124_29.method3641(this.anIntArray104[local11 + this.anInt2038], 0);
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "([BB)I")
	@Override
	protected int method1994(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(52) int local52;
		@Pc(58) int local58;
		if (this.anIntArray104 == null) {
			if (!this.aClass124_29.method3609(this.anInt2043, 0)) {
				return 0;
			}
			@Pc(32) byte[] local32 = this.aClass124_29.method3641(this.anInt2043, 0);
			if (local32 == null) {
				throw new IllegalStateException("");
			}
			this.aClass2_Sub8_2.anInt5725 = 0;
			this.aClass2_Sub8_2.lb = local32;
			local52 = local32.length >> 1;
			this.anIntArray104 = new int[local52];
			for (local58 = 0; local58 < local52; local58++) {
				this.anIntArray104[local58] = this.aClass2_Sub8_2.method5211();
			}
		}
		if (this.anInt2038 >= this.anIntArray104.length) {
			return -1;
		}
		this.method2009();
		this.aClass2_Sub8_2.anInt5725 = 0;
		this.aClass2_Sub8_2.lb = arg0;
		do {
			if (this.aClass2_Sub8_2.lb.length <= this.aClass2_Sub8_2.anInt5725) {
				this.aClass2_Sub8_2.lb = null;
				return arg0.length;
			}
			if (this.aClass2_Sub8_1.lb == null) {
				if (this.aByteArrayArray10[0] == null) {
					this.aClass2_Sub8_2.lb = null;
					return this.aClass2_Sub8_2.anInt5725;
				}
				this.aClass2_Sub8_1.lb = this.aByteArrayArray10[0];
			}
			@Pc(131) int local131 = this.aClass2_Sub8_2.lb.length - this.aClass2_Sub8_2.anInt5725;
			local52 = this.aClass2_Sub8_1.lb.length - this.aClass2_Sub8_1.anInt5725;
			if (local131 < local52) {
				this.aClass2_Sub8_1.method5176(this.aClass2_Sub8_2.lb, this.aClass2_Sub8_2.anInt5725, local131);
				this.aClass2_Sub8_2.lb = null;
				return arg0.length;
			}
			this.aClass2_Sub8_2.method5160(this.aClass2_Sub8_1.lb, local52, this.aClass2_Sub8_1.anInt5725);
			this.anInt2038++;
			this.aClass2_Sub8_1.lb = null;
			this.aClass2_Sub8_1.anInt5725 = 0;
			for (local58 = 0; local58 < 9; local58++) {
				this.aByteArrayArray10[local58] = this.aByteArrayArray10[local58 + 1];
			}
			this.aByteArrayArray10[9] = null;
		} while (this.anIntArray104.length > this.anInt2038);
		this.aClass2_Sub8_2.lb = null;
		return this.aClass2_Sub8_2.anInt5725;
	}
}
