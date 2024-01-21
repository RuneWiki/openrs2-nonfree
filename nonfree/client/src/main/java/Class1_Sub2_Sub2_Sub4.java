import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KSCKZMBT")
public final class Class1_Sub2_Sub2_Sub4 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!KSCKZMBT", name = "r", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!KSCKZMBT", name = "s", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "client!KSCKZMBT", name = "k", descriptor = "I")
	private int anInt408 = -46103;

	@OriginalMember(owner = "client!KSCKZMBT", name = "q", descriptor = "Z")
	public boolean aBoolean75 = false;

	@OriginalMember(owner = "client!KSCKZMBT", name = "t", descriptor = "B")
	private byte aByte15 = -8;

	@OriginalMember(owner = "client!KSCKZMBT", name = "u", descriptor = "Lclient!OPHZBIVR;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!KSCKZMBT", name = "l", descriptor = "I")
	public int anInt409;

	@OriginalMember(owner = "client!KSCKZMBT", name = "m", descriptor = "I")
	public int anInt410;

	@OriginalMember(owner = "client!KSCKZMBT", name = "n", descriptor = "I")
	public int anInt411;

	@OriginalMember(owner = "client!KSCKZMBT", name = "o", descriptor = "I")
	public int anInt412;

	@OriginalMember(owner = "client!KSCKZMBT", name = "p", descriptor = "I")
	public int anInt413;

	@OriginalMember(owner = "client!KSCKZMBT", name = "<init>", descriptor = "(IIIIIIZI)V")
	public Class1_Sub2_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass33_1 = Class33.aClass33Array1[arg0];
			this.anInt409 = arg5;
			this.anInt410 = arg2;
			this.anInt411 = arg1;
			this.anInt412 = arg3;
			this.anInt413 = arg4 + arg7;
			this.aBoolean75 = false;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("76477, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KSCKZMBT", name = "a", descriptor = "(I)Lclient!IRLTEWJP;")
	@Override
	protected Class1_Sub2_Sub2_Sub3 method574() {
		try {
			@Pc(3) Class1_Sub2_Sub2_Sub3 local3 = this.aClass33_1.method355();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass33_1.aClass36_1.anIntArray131[this.anInt414];
			@Pc(26) Class1_Sub2_Sub2_Sub3 local26 = new Class1_Sub2_Sub2_Sub3(local3, false, 0, Class11.method123(local15), true);
			if (!this.aBoolean75) {
				local26.method203();
				local26.method204(local15);
				local26.anIntArrayArray11 = null;
				local26.anIntArrayArray10 = null;
			}
			if (this.aClass33_1.anInt501 != 128 || this.aClass33_1.anInt502 != 128) {
				local26.method212(this.aClass33_1.anInt501, this.aByte15, this.aClass33_1.anInt502, this.aClass33_1.anInt501);
			}
			if (this.aClass33_1.anInt503 != 0) {
				if (this.aClass33_1.anInt503 == 90) {
					local26.method207((byte) 4);
				}
				if (this.aClass33_1.anInt503 == 180) {
					local26.method207((byte) 4);
					local26.method207((byte) 4);
				}
				if (this.aClass33_1.anInt503 == 270) {
					local26.method207((byte) 4);
					local26.method207((byte) 4);
					local26.method207((byte) 4);
				}
			}
			local26.method213(this.aClass33_1.anInt504 + 64, this.aClass33_1.anInt505 + 850, -30, -50, -30, true);
			return local26;
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("18353, " + -840 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KSCKZMBT", name = "a", descriptor = "(IB)V")
	public void method236(@OriginalArg(0) int arg0) {
		try {
			this.anInt415 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt415 <= this.aClass33_1.aClass36_1.method371(this.anInt414)) {
							return;
						}
						this.anInt415 -= this.aClass33_1.aClass36_1.method371(this.anInt414) + 1;
						this.anInt414++;
					} while (this.anInt414 < this.aClass33_1.aClass36_1.anInt532);
				} while (this.anInt414 >= 0 && this.anInt414 < this.aClass33_1.aClass36_1.anInt532);
				this.anInt414 = 0;
				this.aBoolean75 = true;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("13748, " + arg0 + ", " + 3 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
