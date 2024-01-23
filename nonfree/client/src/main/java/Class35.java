import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class35 implements Interface4 {

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
	private int anInt1027 = 50;

	@OriginalMember(owner = "client!fa", name = "C", descriptor = "Lclient!oe;")
	private Class72 aClass72_70;

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "Lclient!oe;")
	private Class72 aClass72_69;

	@OriginalMember(owner = "client!fa", name = "E", descriptor = "Lclient!wc;")
	private Class110 aClass110_9;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!fa", name = "z", descriptor = "[Z")
	private boolean[] aBooleanArray36;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "[Z")
	private boolean[] aBooleanArray32;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "[Z")
	private boolean[] aBooleanArray34;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "[Z")
	private boolean[] aBooleanArray33;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "[Z")
	private boolean[] aBooleanArray35;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!oe;Lclient!oe;Lclient!oe;IZ)V")
	public Class35(@OriginalArg(0) Class72 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean38 = arg4;
		this.aClass72_70 = arg2;
		this.anInt1027 = arg3;
		this.aClass72_69 = arg0;
		this.aClass110_9 = new Class110(this.anInt1027);
		@Pc(37) Class2_Sub23 local37 = new Class2_Sub23(arg1.method3197(0, 0));
		@Pc(41) int local41 = local37.method2095();
		this.aByteArray14 = new byte[local41];
		this.aShortArray31 = new short[local41];
		this.aBooleanArray36 = new boolean[local41];
		this.aBooleanArray32 = new boolean[local41];
		this.aBooleanArray34 = new boolean[local41];
		this.aBooleanArray33 = new boolean[local41];
		this.aByteArray16 = new byte[local41];
		this.aBooleanArray35 = new boolean[local41];
		this.aByteArray15 = new byte[local41];
		this.aByteArray13 = new byte[local41];
		for (@Pc(83) int local83 = 0; local83 < local41; local83++) {
			this.aBooleanArray35[local83] = local37.method2122() == 1;
		}
		for (@Pc(109) int local109 = 0; local109 < local41; local109++) {
			if (this.aBooleanArray35[local109]) {
				this.aBooleanArray36[local109] = local37.method2122() == 1;
			}
		}
		for (@Pc(140) int local140 = 0; local140 < local41; local140++) {
			if (this.aBooleanArray35[local140]) {
				this.aBooleanArray34[local140] = local37.method2122() == 1;
			}
		}
		for (@Pc(171) int local171 = 0; local171 < local41; local171++) {
			if (this.aBooleanArray35[local171]) {
				this.aBooleanArray33[local171] = local37.method2122() == 1;
			}
		}
		for (@Pc(198) int local198 = 0; local198 < local41; local198++) {
			if (this.aBooleanArray35[local198]) {
				this.aBooleanArray32[local198] = local37.method2122() == 1;
			}
		}
		for (@Pc(227) int local227 = 0; local227 < local41; local227++) {
			if (this.aBooleanArray35[local227]) {
				this.aByteArray13[local227] = local37.method2114();
			}
		}
		for (@Pc(247) int local247 = 0; local247 < local41; local247++) {
			if (this.aBooleanArray35[local247]) {
				this.aByteArray15[local247] = local37.method2114();
			}
		}
		for (@Pc(267) int local267 = 0; local267 < local41; local267++) {
			if (this.aBooleanArray35[local267]) {
				this.aByteArray16[local267] = local37.method2114();
			}
		}
		for (@Pc(287) int local287 = 0; local287 < local41; local287++) {
			if (this.aBooleanArray35[local287]) {
				this.aByteArray14[local287] = local37.method2114();
			}
		}
		for (@Pc(307) int local307 = 0; local307 < local41; local307++) {
			if (this.aBooleanArray35[local307]) {
				this.aShortArray31[local307] = (short) local37.method2095();
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(II)V")
	public void method763(@OriginalArg(1) int arg0) {
		for (@Pc(5) Class2_Sub3_Sub13 local5 = (Class2_Sub3_Sub13) this.aClass110_9.method3887(); local5 != null; local5 = (Class2_Sub3_Sub13) this.aClass110_9.method3888()) {
			if (local5.aBoolean69) {
				local5.method1466(arg0);
				local5.aBoolean69 = false;
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method756(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub3_Sub13 local8 = this.method765(arg0);
		return local8 == null ? null : local8.method1467(this.aClass72_70, this, this.aBoolean38 || this.aBooleanArray33[arg0]);
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method761(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub3_Sub13 local14 = this.method765(arg0);
		return local14 == null ? false : local14.method1463(this, this.aClass72_70);
	}

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "(II)Lclient!hg;")
	private Class2_Sub3_Sub13 method765(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub3_Sub13 local11 = (Class2_Sub3_Sub13) this.aClass110_9.method3891((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(22) byte[] local22 = this.aClass72_69.method3197(0, arg0);
		if (local22 == null) {
			return null;
		} else {
			@Pc(31) Class2_Sub23 local31 = new Class2_Sub23(local22);
			local11 = new Class2_Sub3_Sub13(local31);
			this.aClass110_9.method3894(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZB)V")
	public void method766(@OriginalArg(0) boolean arg0) {
		this.aBoolean38 = arg0;
		this.method770();
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(II)Z")
	@Override
	public boolean method762(@OriginalArg(1) int arg0) {
		return this.aBooleanArray36[arg0];
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)I")
	@Override
	public int method759(@OriginalArg(0) int arg0) {
		return this.aShortArray31[arg0] & 0xFFFF;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method758(@OriginalArg(0) int arg0) {
		return this.aBooleanArray34[arg0];
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	public void method770() {
		this.aClass110_9.method3889();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method760(@OriginalArg(0) int arg0) {
		return this.aBoolean38 || this.aBooleanArray33[arg0];
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(FII)[I")
	@Override
	public int[] method757(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class2_Sub3_Sub13 local10 = this.method765(arg1);
		if (local10 == null) {
			return null;
		} else {
			local10.aBoolean69 = true;
			return local10.method1464(this.aClass72_70, arg0, this, this.aBoolean38 || this.aBooleanArray33[arg1]);
		}
	}
}
