import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!vb", name = "pb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!vb", name = "zb", descriptor = "I")
	private int anInt4444;

	@OriginalMember(owner = "client!vb", name = "Ab", descriptor = "I")
	private int anInt4445;

	@OriginalMember(owner = "client!vb", name = "kb", descriptor = "Z")
	private boolean aBoolean250 = false;

	@OriginalMember(owner = "client!vb", name = "rb", descriptor = "I")
	private int anInt4437 = -1;

	@OriginalMember(owner = "client!vb", name = "Db", descriptor = "Z")
	private volatile boolean aBoolean251 = false;

	@OriginalMember(owner = "client!vb", name = "sb", descriptor = "I")
	private int anInt4438;

	@OriginalMember(owner = "client!vb", name = "jb", descriptor = "Lclient!sf;")
	private Class90 aClass90_3;

	@OriginalMember(owner = "client!vb", name = "nb", descriptor = "Lclient!sf;")
	private Class90 aClass90_4;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!sf;Lclient!sf;IZZZ)V")
	public Class7_Sub1(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aBoolean250 = arg5;
		this.anInt4438 = arg2;
		this.aClass90_3 = arg1;
		this.aClass90_4 = arg0;
		Static12.method225(this.anInt4438, this);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V")
	@Override
	protected void method3216(@OriginalArg(0) int arg0) {
		if (this.method3224(arg0)) {
			Static9.method3238(this.anInt4438, arg0);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BZ[BILclient!sf;)V")
	public void method3252(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class90 arg3) {
		@Pc(63) int local63;
		if (arg3 != this.aClass90_3) {
			if (!arg0 && this.anInt4437 == arg2) {
				this.aBoolean251 = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.aBooleanArray24[arg2] = false;
				if (this.aBoolean250 || arg0) {
					Static107.method1856(super.anIntArray579[arg2], arg2, arg0, this.anInt4438, (byte) 2, this);
				}
				return;
			}
			Static146.aCRC32_1.reset();
			Static146.aCRC32_1.update(arg1, 0, arg1.length - 2);
			local63 = (int) Static146.aCRC32_1.getValue();
			@Pc(83) int local83 = (arg1[arg1.length - 1] & 0xFF) + ((arg1[arg1.length - 2] & 0xFF) << 8);
			if (super.anIntArray579[arg2] != local63 || local83 != super.anIntArray578[arg2]) {
				this.aBooleanArray24[arg2] = false;
				if (this.aBoolean250 || arg0) {
					Static107.method1856(super.anIntArray579[arg2], arg2, arg0, this.anInt4438, (byte) 2, this);
				}
				return;
			}
			this.aBooleanArray24[arg2] = true;
			if (arg0) {
				super.anObjectArray30[arg2] = Static116.method1977(arg1);
			}
			return;
		}
		if (this.aBoolean251) {
			throw new RuntimeException();
		}
		if (arg1 == null) {
			Static107.method1856(this.anInt4445, this.anInt4438, true, 255, (byte) 0, this);
			return;
		}
		Static146.aCRC32_1.reset();
		Static146.aCRC32_1.update(arg1, 0, arg1.length);
		local63 = (int) Static146.aCRC32_1.getValue();
		if (this.anInt4445 != local63) {
			Static107.method1856(this.anInt4445, this.anInt4438, true, 255, (byte) 0, this);
			return;
		}
		@Pc(197) Class1_Sub9 local197;
		try {
			local197 = new Class1_Sub9(Static67.method1210(arg1));
		} catch (@Pc(199) RuntimeException local199) {
			Static107.method1856(this.anInt4445, this.anInt4438, true, 255, (byte) 0, this);
			return;
		}
		@Pc(214) int local214 = local197.method895();
		if (local214 != 5 && local214 != 6) {
			Static107.method1856(this.anInt4445, this.anInt4438, true, 255, (byte) 0, this);
			return;
		}
		@Pc(237) int local237 = 0;
		if (local214 >= 6) {
			local237 = local197.method915();
		}
		if (local237 != this.anInt4444) {
			Static107.method1856(this.anInt4445, this.anInt4438, true, 255, (byte) 0, this);
			return;
		}
		this.method3220(arg1);
		this.method3255();
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(II)V")
	@Override
	protected void method3241(@OriginalArg(1) int arg0) {
		if (!this.method3224(arg0)) {
			return;
		}
		if (this.aClass90_4 == null || this.aBooleanArray24 == null || !this.aBooleanArray24[arg0]) {
			Static107.method1856(super.anIntArray579[arg0], arg0, true, this.anInt4438, (byte) 2, this);
		} else {
			Static201.method3124(arg0, this.aClass90_4, this);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIBZ[B)V")
	public void method3253(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		if (!arg2) {
			arg3[arg3.length - 2] = (byte) (super.anIntArray578[arg1] >> 8);
			arg3[arg3.length - 1] = (byte) super.anIntArray578[arg1];
			if (this.aClass90_4 != null) {
				Static91.method1589(arg3, arg1, this.aClass90_4);
				this.aBooleanArray24[arg1] = true;
			}
			if (arg0) {
				super.anObjectArray30[arg1] = Static116.method1977(arg3);
			}
		} else if (this.aBoolean251) {
			throw new RuntimeException();
		} else {
			if (this.aClass90_3 != null) {
				Static91.method1589(arg3, this.anInt4438, this.aClass90_3);
			}
			this.method3220(arg3);
			this.method3255();
		}
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V")
	private void method3255() {
		this.aBooleanArray24 = new boolean[super.anObjectArray30.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray24.length; local13++) {
			this.aBooleanArray24[local13] = false;
		}
		if (this.aClass90_4 == null) {
			this.aBoolean251 = true;
			return;
		}
		this.anInt4437 = -1;
		for (@Pc(52) int local52 = 0; local52 < this.aBooleanArray24.length; local52++) {
			if (super.anIntArray576[local52] > 0) {
				Static141.method2420(this.aClass90_4, this, local52);
				this.anInt4437 = local52;
			}
		}
		if (this.anInt4437 == -1) {
			this.aBoolean251 = true;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZI)V")
	public void method3257(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4444 = arg1;
		this.anInt4445 = arg0;
		if (this.aClass90_3 == null) {
			Static107.method1856(this.anInt4445, this.anInt4438, true, 255, (byte) 0, this);
		} else {
			Static201.method3124(this.anInt4438, this.aClass90_3, this);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)I")
	public int method3258() {
		if (this.aBoolean251) {
			return 100;
		} else if (super.anObjectArray30 == null) {
			@Pc(27) int local27 = Static5.method84(255, this.anInt4438);
			if (local27 >= 100) {
				local27 = 99;
			}
			return local27;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
	@Override
	protected int method3219(@OriginalArg(1) int arg0) {
		if (!this.method3224(arg0)) {
			return 0;
		} else if (super.anObjectArray30[arg0] == null) {
			return this.aBooleanArray24[arg0] ? 100 : Static5.method84(this.anInt4438, arg0);
		} else {
			return 100;
		}
	}
}
