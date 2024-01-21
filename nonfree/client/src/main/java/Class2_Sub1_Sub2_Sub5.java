import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QEZQDRNH")
public final class Class2_Sub1_Sub2_Sub5 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!QEZQDRNH", name = "r", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!QEZQDRNH", name = "s", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!QEZQDRNH", name = "n", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!QEZQDRNH", name = "o", descriptor = "B")
	private byte aByte15 = 0;

	@OriginalMember(owner = "client!QEZQDRNH", name = "q", descriptor = "Z")
	private boolean aBoolean140 = false;

	@OriginalMember(owner = "client!QEZQDRNH", name = "p", descriptor = "Lclient!SDNQJNMP;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!QEZQDRNH", name = "t", descriptor = "I")
	public int anInt358;

	@OriginalMember(owner = "client!QEZQDRNH", name = "u", descriptor = "I")
	public int anInt359;

	@OriginalMember(owner = "client!QEZQDRNH", name = "v", descriptor = "I")
	public int anInt360;

	@OriginalMember(owner = "client!QEZQDRNH", name = "w", descriptor = "I")
	public int anInt361;

	@OriginalMember(owner = "client!QEZQDRNH", name = "x", descriptor = "I")
	public int anInt362;

	@OriginalMember(owner = "client!QEZQDRNH", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class2_Sub1_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass33_1 = Class33.aClass33Array1[arg1];
			this.anInt358 = arg0;
			this.anInt359 = arg2;
			this.anInt360 = arg4;
			this.anInt361 = arg3;
			this.anInt362 = arg6 + arg5;
			this.aBoolean139 = false;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("247, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QEZQDRNH", name = "a", descriptor = "(I)Lclient!IEHKDFMR;")
	@Override
	protected Class2_Sub1_Sub2_Sub2 method469() {
		try {
			@Pc(13) Class2_Sub1_Sub2_Sub2 local13 = this.aClass33_1.method318();
			if (local13 == null) {
				return null;
			}
			@Pc(25) int local25 = this.aClass33_1.aClass39_2.anIntArray166[this.anInt356];
			@Pc(37) Class2_Sub1_Sub2_Sub2 local37 = new Class2_Sub1_Sub2_Sub2(false, (byte) 1, Class26.method223(this.aByte15, local25), local13, true);
			if (!this.aBoolean139) {
				local37.method158();
				local37.method159((byte) 9, local25);
				local37.anIntArrayArray8 = null;
				local37.anIntArrayArray7 = null;
			}
			if (this.aClass33_1.anInt477 != 128 || this.aClass33_1.anInt478 != 128) {
				local37.method167(this.aClass33_1.anInt477, this.aClass33_1.anInt478, this.aClass33_1.anInt477);
			}
			if (this.aClass33_1.anInt479 != 0) {
				if (this.aClass33_1.anInt479 == 90) {
					local37.method162();
				}
				if (this.aClass33_1.anInt479 == 180) {
					local37.method162();
					local37.method162();
				}
				if (this.aClass33_1.anInt479 == 270) {
					local37.method162();
					local37.method162();
					local37.method162();
				}
			}
			local37.method168(this.aClass33_1.anInt480 + 64, this.aClass33_1.anInt481 + 850, -30, -50, -30, true);
			return local37;
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("68512, " + 0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QEZQDRNH", name = "a", descriptor = "(IB)V")
	public void method280(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 != -7) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			this.anInt357 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt357 <= this.aClass33_1.aClass39_2.method403(this.anInt356)) {
							return;
						}
						this.anInt357 -= this.aClass33_1.aClass39_2.method403(this.anInt356) + 1;
						this.anInt356++;
					} while (this.anInt356 < this.aClass33_1.aClass39_2.anInt585);
				} while (this.anInt356 >= 0 && this.anInt356 < this.aClass33_1.aClass39_2.anInt585);
				this.anInt356 = 0;
				this.aBoolean139 = true;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("41955, " + arg0 + ", " + arg1 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
