import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ATJMVOZR")
public final class Class2 {

	@OriginalMember(owner = "client!ATJMVOZR", name = "c", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!ATJMVOZR", name = "d", descriptor = "I")
	private int anInt30;

	@OriginalMember(owner = "client!ATJMVOZR", name = "e", descriptor = "[I")
	private int[] anIntArray7;

	@OriginalMember(owner = "client!ATJMVOZR", name = "f", descriptor = "[I")
	private int[] anIntArray8;

	@OriginalMember(owner = "client!ATJMVOZR", name = "g", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!ATJMVOZR", name = "h", descriptor = "[I")
	private int[] anIntArray10;

	@OriginalMember(owner = "client!ATJMVOZR", name = "i", descriptor = "Z")
	private boolean aBoolean3;

	@OriginalMember(owner = "client!ATJMVOZR", name = "a", descriptor = "I")
	private int anInt29 = -766;

	@OriginalMember(owner = "client!ATJMVOZR", name = "b", descriptor = "Z")
	private boolean aBoolean2 = true;

	@OriginalMember(owner = "client!ATJMVOZR", name = "<init>", descriptor = "([BI)V")
	public Class2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.method1(arg0);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("5971, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ATJMVOZR", name = "a", descriptor = "(I[B)V")
	private void method1(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class10_Sub1_Sub3 local7 = new Class10_Sub1_Sub3(true, arg0);
			@Pc(10) int local10 = local7.method315();
			@Pc(13) int local13 = local7.method315();
			if (local13 == local10) {
				this.aByteArray7 = arg0;
				this.aBoolean3 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class31.method363(local19, local10, arg0, local13, 6);
				this.aByteArray7 = local19;
				local7 = new Class10_Sub1_Sub3(true, this.aByteArray7);
				this.aBoolean3 = true;
			}
			this.anInt30 = local7.method313();
			this.anIntArray7 = new int[this.anInt30];
			this.anIntArray8 = new int[this.anInt30];
			this.anIntArray9 = new int[this.anInt30];
			this.anIntArray10 = new int[this.anInt30];
			@Pc(82) int local82 = local7.anInt428 + this.anInt30 * 10;
			for (@Pc(84) int local84 = 0; local84 < this.anInt30; local84++) {
				this.anIntArray7[local84] = local7.method316();
				this.anIntArray8[local84] = local7.method315();
				this.anIntArray9[local84] = local7.method315();
				this.anIntArray10[local84] = local82;
				local82 += this.anIntArray9[local84];
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("56904, " + 0 + ", " + arg0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ATJMVOZR", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method2(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt30; local27++) {
			if (this.anIntArray7[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray8[local27]];
				}
				if (this.aBoolean3) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray8[local27]; local67++) {
						arg1[local67] = this.aByteArray7[this.anIntArray10[local27] + local67];
					}
				} else {
					Class31.method363(arg1, this.anIntArray8[local27], this.aByteArray7, this.anIntArray9[local27], this.anIntArray10[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
