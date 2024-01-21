import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ROWJKVEC")
public final class Class3_Sub1_Sub1_Sub4 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!ROWJKVEC", name = "p", descriptor = "I")
	private int anInt587;

	@OriginalMember(owner = "client!ROWJKVEC", name = "q", descriptor = "I")
	private int anInt588;

	@OriginalMember(owner = "client!ROWJKVEC", name = "o", descriptor = "B")
	private byte aByte27 = 1;

	@OriginalMember(owner = "client!ROWJKVEC", name = "r", descriptor = "Z")
	public boolean aBoolean156 = false;

	@OriginalMember(owner = "client!ROWJKVEC", name = "w", descriptor = "I")
	private int anInt593 = -13956;

	@OriginalMember(owner = "client!ROWJKVEC", name = "x", descriptor = "Lclient!XWNROHZR;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!ROWJKVEC", name = "s", descriptor = "I")
	public int anInt589;

	@OriginalMember(owner = "client!ROWJKVEC", name = "t", descriptor = "I")
	public int anInt590;

	@OriginalMember(owner = "client!ROWJKVEC", name = "u", descriptor = "I")
	public int anInt591;

	@OriginalMember(owner = "client!ROWJKVEC", name = "v", descriptor = "I")
	public int anInt592;

	@OriginalMember(owner = "client!ROWJKVEC", name = "n", descriptor = "I")
	public int anInt586;

	@OriginalMember(owner = "client!ROWJKVEC", name = "<init>", descriptor = "(IIIIIZII)V")
	public Class3_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass44_1 = Class44.aClass44Array1[arg3];
			this.anInt589 = arg4;
			this.anInt590 = arg7;
			this.anInt591 = arg1;
			this.anInt592 = arg2;
			this.anInt586 = arg6 + arg0;
			this.aBoolean156 = false;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("32368, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ROWJKVEC", name = "a", descriptor = "(II)V")
	public void method392(@OriginalArg(1) int arg0) {
		try {
			this.anInt588 += arg0;
			if (this.anInt593 == -13956) {
				while (true) {
					do {
						do {
							if (this.anInt588 <= this.aClass44_1.aClass38_2.method525((byte) 5, this.anInt587)) {
								return;
							}
							this.anInt588 -= this.aClass44_1.aClass38_2.method525((byte) 5, this.anInt587) + 1;
							this.anInt587++;
						} while (this.anInt587 < this.aClass44_1.aClass38_2.anInt707);
					} while (this.anInt587 >= 0 && this.anInt587 < this.aClass44_1.aClass38_2.anInt707);
					this.anInt587 = 0;
					this.aBoolean156 = true;
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("4507, " + -13956 + ", " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ROWJKVEC", name = "a", descriptor = "(I)Lclient!CADBNSXE;")
	@Override
	protected Class3_Sub1_Sub1_Sub1 method562(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class3_Sub1_Sub1_Sub1 local3 = this.aClass44_1.method552();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass44_1.aClass38_2.anIntArray191[this.anInt587];
			@Pc(27) Class3_Sub1_Sub1_Sub1 local27 = new Class3_Sub1_Sub1_Sub1(false, Class7.method94(local15), local3, this.aByte27, true);
			if (arg0 >= 0) {
				throw new NullPointerException();
			}
			if (!this.aBoolean156) {
				local27.method29();
				local27.method30(local15);
				local27.anIntArrayArray3 = null;
				local27.anIntArrayArray2 = null;
			}
			if (this.aClass44_1.anInt764 != 128 || this.aClass44_1.anInt765 != 128) {
				local27.method38(this.aClass44_1.anInt764, this.aClass44_1.anInt765, this.aClass44_1.anInt764);
			}
			if (this.aClass44_1.anInt766 != 0) {
				if (this.aClass44_1.anInt766 == 90) {
					local27.method33();
				}
				if (this.aClass44_1.anInt766 == 180) {
					local27.method33();
					local27.method33();
				}
				if (this.aClass44_1.anInt766 == 270) {
					local27.method33();
					local27.method33();
					local27.method33();
				}
			}
			local27.method39(this.aClass44_1.anInt767 + 64, this.aClass44_1.anInt768 + 850, -30, -50, -30, true);
			return local27;
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("83790, " + arg0 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}
}
