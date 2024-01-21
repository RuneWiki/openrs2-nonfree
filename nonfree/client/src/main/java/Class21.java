import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JUPFHAZZ")
public final class Class21 {

	@OriginalMember(owner = "client!JUPFHAZZ", name = "d", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!JUPFHAZZ", name = "e", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!JUPFHAZZ", name = "f", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!JUPFHAZZ", name = "g", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!JUPFHAZZ", name = "h", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!JUPFHAZZ", name = "i", descriptor = "[I")
	private int[] anIntArray91;

	@OriginalMember(owner = "client!JUPFHAZZ", name = "j", descriptor = "Z")
	private boolean aBoolean87;

	@OriginalMember(owner = "client!JUPFHAZZ", name = "a", descriptor = "I")
	private int anInt367 = 720;

	@OriginalMember(owner = "client!JUPFHAZZ", name = "b", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!JUPFHAZZ", name = "c", descriptor = "I")
	private int anInt368 = -223;

	@OriginalMember(owner = "client!JUPFHAZZ", name = "<init>", descriptor = "(I[B)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method274(arg1);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("33102, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JUPFHAZZ", name = "a", descriptor = "(Z[B)V")
	private void method274(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class2_Sub1_Sub4 local7 = new Class2_Sub1_Sub4(859, arg0);
			@Pc(10) int local10 = local7.method496();
			@Pc(13) int local13 = local7.method496();
			if (local13 == local10) {
				this.aByteArray11 = arg0;
				this.aBoolean87 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class17.method165(local19, local10, arg0, local13, 6);
				this.aByteArray11 = local19;
				local7 = new Class2_Sub1_Sub4(859, this.aByteArray11);
				this.aBoolean87 = true;
			}
			this.anInt369 = local7.method494();
			this.anIntArray88 = new int[this.anInt369];
			this.anIntArray89 = new int[this.anInt369];
			this.anIntArray90 = new int[this.anInt369];
			this.anIntArray91 = new int[this.anInt369];
			@Pc(79) int local79 = local7.anInt672 + this.anInt369 * 10;
			for (@Pc(91) int local91 = 0; local91 < this.anInt369; local91++) {
				this.anIntArray88[local91] = local7.method497();
				this.anIntArray89[local91] = local7.method496();
				this.anIntArray90[local91] = local7.method496();
				this.anIntArray91[local91] = local79;
				local79 += this.anIntArray90[local91];
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("49856, " + true + ", " + arg0 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JUPFHAZZ", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method275(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt369; local27++) {
			if (this.anIntArray88[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray89[local27]];
				}
				if (this.aBoolean87) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray89[local27]; local67++) {
						arg1[local67] = this.aByteArray11[this.anIntArray91[local27] + local67];
					}
				} else {
					Class17.method165(arg1, this.anIntArray89[local27], this.aByteArray11, this.anIntArray90[local27], this.anIntArray91[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
