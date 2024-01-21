import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EPOYVBCN")
public final class Class3_Sub1_Sub2_Sub2 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!EPOYVBCN", name = "n", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!EPOYVBCN", name = "o", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!EPOYVBCN", name = "p", descriptor = "Z")
	private boolean aBoolean52 = true;

	@OriginalMember(owner = "client!EPOYVBCN", name = "v", descriptor = "Z")
	public boolean aBoolean53 = false;

	@OriginalMember(owner = "client!EPOYVBCN", name = "q", descriptor = "Lclient!CIVOPMKV;")
	private Class7 aClass7_1;

	@OriginalMember(owner = "client!EPOYVBCN", name = "r", descriptor = "I")
	public int anInt154;

	@OriginalMember(owner = "client!EPOYVBCN", name = "s", descriptor = "I")
	public int anInt155;

	@OriginalMember(owner = "client!EPOYVBCN", name = "t", descriptor = "I")
	public int anInt156;

	@OriginalMember(owner = "client!EPOYVBCN", name = "u", descriptor = "I")
	public int anInt157;

	@OriginalMember(owner = "client!EPOYVBCN", name = "w", descriptor = "I")
	public int anInt158;

	@OriginalMember(owner = "client!EPOYVBCN", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class3_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass7_1 = Class7.aClass7Array1[arg7];
			this.anInt154 = arg4;
			this.anInt155 = arg0;
			this.anInt156 = arg2;
			this.anInt157 = arg5;
			this.anInt158 = arg3 + arg6;
			this.aBoolean53 = false;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("19945, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPOYVBCN", name = "a", descriptor = "(ZI)V")
	public void method110(@OriginalArg(1) int arg0) {
		try {
			this.anInt153 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt153 <= this.aClass7_1.aClass49_1.method567(this.anInt152)) {
							return;
						}
						this.anInt153 -= this.aClass7_1.aClass49_1.method567(this.anInt152) + 1;
						this.anInt152++;
					} while (this.anInt152 < this.aClass7_1.aClass49_1.anInt786);
				} while (this.anInt152 >= 0 && this.anInt152 < this.aClass7_1.aClass49_1.anInt786);
				this.anInt152 = 0;
				this.aBoolean53 = true;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("6110, " + true + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPOYVBCN", name = "a", descriptor = "(Z)Lclient!YABPKWWG;")
	@Override
	protected Class3_Sub1_Sub2_Sub6 method505() {
		try {
			@Pc(3) Class3_Sub1_Sub2_Sub6 local3 = this.aClass7_1.method69();
			if (local3 == null) {
				return null;
			}
			@Pc(24) int local24 = this.aClass7_1.aClass49_1.anIntArray206[this.anInt152];
			@Pc(35) Class3_Sub1_Sub2_Sub6 local35 = new Class3_Sub1_Sub2_Sub6(660, local3, Class15.method125(local24), true, false);
			if (!this.aBoolean53) {
				local35.method517();
				local35.method518(598, local24);
				local35.anIntArrayArray18 = null;
				local35.anIntArrayArray17 = null;
			}
			if (this.aClass7_1.anInt124 != 128 || this.aClass7_1.anInt125 != 128) {
				local35.method526(this.aClass7_1.anInt125, this.aClass7_1.anInt124, this.aClass7_1.anInt124);
			}
			if (this.aClass7_1.anInt126 != 0) {
				if (this.aClass7_1.anInt126 == 90) {
					local35.method521();
				}
				if (this.aClass7_1.anInt126 == 180) {
					local35.method521();
					local35.method521();
				}
				if (this.aClass7_1.anInt126 == 270) {
					local35.method521();
					local35.method521();
					local35.method521();
				}
			}
			local35.method527(this.aClass7_1.anInt127 + 64, this.aClass7_1.anInt128 + 850, -30, -50, -30, true);
			return local35;
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("16390, " + true + ", " + local129.toString());
			throw new RuntimeException();
		}
	}
}
