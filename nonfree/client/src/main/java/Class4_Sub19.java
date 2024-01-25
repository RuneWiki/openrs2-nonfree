import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class Class4_Sub19 extends Class4 {

	@OriginalMember(owner = "client!tk", name = "s", descriptor = "Z")
	public boolean aBoolean255;

	@OriginalMember(owner = "client!tk", name = "B", descriptor = "Z")
	protected boolean aBoolean258;

	@OriginalMember(owner = "client!tk", name = "ab", descriptor = "Z")
	protected boolean aBoolean267;

	@OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
	public int anInt3050 = 0;

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
	public int anInt3054 = 0;

	@OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
	public int anInt3052 = 1;

	@OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
	protected int anInt3058 = 2;

	@OriginalMember(owner = "client!tk", name = "j", descriptor = "Z")
	public boolean aBoolean251 = true;

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
	protected int anInt3055 = 0;

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "Z")
	public boolean aBoolean254 = true;

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "Z")
	public boolean aBoolean256 = false;

	@OriginalMember(owner = "client!tk", name = "I", descriptor = "Z")
	public boolean aBoolean260 = true;

	@OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
	public int anInt3059 = 0;

	@OriginalMember(owner = "client!tk", name = "C", descriptor = "Z")
	public boolean aBoolean259 = true;

	@OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
	public int anInt3068 = 127;

	@OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
	public int anInt3061 = 0;

	@OriginalMember(owner = "client!tk", name = "M", descriptor = "Z")
	public boolean aBoolean262 = true;

	@OriginalMember(owner = "client!tk", name = "O", descriptor = "Z")
	public boolean aBoolean263 = false;

	@OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
	public int anInt3066 = 127;

	@OriginalMember(owner = "client!tk", name = "A", descriptor = "Z")
	public boolean aBoolean257 = false;

	@OriginalMember(owner = "client!tk", name = "Q", descriptor = "Z")
	public boolean aBoolean264 = true;

	@OriginalMember(owner = "client!tk", name = "n", descriptor = "Z")
	public boolean aBoolean253 = true;

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "Z")
	public boolean aBoolean252 = true;

	@OriginalMember(owner = "client!tk", name = "z", descriptor = "I")
	public int anInt3060 = 2;

	@OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
	public int anInt3064 = 127;

	@OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
	public int anInt3063 = 2;

	@OriginalMember(owner = "client!tk", name = "P", descriptor = "I")
	public int anInt3069 = 2;

	@OriginalMember(owner = "client!tk", name = "K", descriptor = "Z")
	public boolean aBoolean261 = true;

	@OriginalMember(owner = "client!tk", name = "R", descriptor = "Z")
	protected boolean aBoolean265 = true;

	@OriginalMember(owner = "client!tk", name = "X", descriptor = "I")
	public int anInt3074 = 0;

	@OriginalMember(owner = "client!tk", name = "T", descriptor = "I")
	public int anInt3071 = 0;

	@OriginalMember(owner = "client!tk", name = "Y", descriptor = "I")
	public int anInt3075 = 0;

	@OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
	public int anInt3062 = 3;

	@OriginalMember(owner = "client!tk", name = "Z", descriptor = "I")
	protected int anInt3076 = 0;

	@OriginalMember(owner = "client!tk", name = "W", descriptor = "I")
	public int anInt3073 = 3;

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
	public int anInt3051 = 127;

	@OriginalMember(owner = "client!tk", name = "V", descriptor = "Z")
	public boolean aBoolean266 = true;

	@OriginalMember(owner = "client!tk", name = "bb", descriptor = "I")
	public int anInt3077 = 127;

	@OriginalMember(owner = "client!tk", name = "eb", descriptor = "Z")
	public boolean aBoolean268 = true;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	protected Class4_Sub19() {
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)Z")
	public final boolean method2771(@OriginalArg(0) int arg0) {
		return Static314.method5296(arg0) ? this.aBoolean267 : this.aBoolean258;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(III)V")
	public final void method2772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static314.method5296(arg1)) {
			this.anInt3058 = arg0;
		} else {
			this.anInt3076 = arg0;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)I")
	public final int method2774(@OriginalArg(0) int arg0) {
		return Static314.method5296(arg0) ? this.anInt3058 : this.anInt3076;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLclient!un;)V")
	public final void method2776(@OriginalArg(1) Class4_Sub11 arg0) {
		arg0.method4957(22);
		arg0.method4957(this.anInt3073);
		arg0.method4957(this.aBoolean265 ? 1 : 0);
		arg0.method4957(this.aBoolean268 ? 1 : 0);
		arg0.method4957(this.aBoolean264 ? 1 : 0);
		arg0.method4957(this.aBoolean260 ? 1 : 0);
		arg0.method4957(0);
		arg0.method4957(this.aBoolean253 ? 1 : 0);
		arg0.method4957(this.aBoolean252 ? 1 : 0);
		arg0.method4957(this.aBoolean251 ? 1 : 0);
		arg0.method4957(this.anInt3058);
		arg0.method4957(this.anInt3076);
		arg0.method4957(this.aBoolean267 ? 1 : 0);
		arg0.method4957(this.aBoolean258 ? 1 : 0);
		arg0.method4957(this.aBoolean261 ? 1 : 0);
		arg0.method4957(this.aBoolean266 ? 1 : 0);
		arg0.method4957(this.anInt3059);
		arg0.method4957(this.aBoolean254 ? 1 : 0);
		arg0.method4957(this.anInt3064);
		arg0.method4957(this.anInt3077);
		arg0.method4957(this.anInt3066);
		arg0.method4957(this.anInt3051);
		arg0.method4957(this.anInt3068);
		arg0.method4937(this.anInt3050);
		arg0.method4937(this.anInt3054);
		arg0.method4957(Static165.method3013());
		arg0.method4909(this.anInt3071);
		arg0.method4957(this.anInt3060);
		arg0.method4957(this.aBoolean263 ? 1 : 0);
		arg0.method4957(this.aBoolean255 ? 1 : 0);
		arg0.method4957(this.anInt3074);
		arg0.method4957(this.aBoolean257 ? 1 : 0);
		arg0.method4957(this.aBoolean259 ? 1 : 0);
		arg0.method4957(this.anInt3052);
		arg0.method4957(this.aBoolean262 ? 1 : 0);
		arg0.method4957(this.anInt3063);
		arg0.method4957(this.anInt3069);
		arg0.method4957(this.aBoolean256 ? 1 : 0);
		arg0.method4957(this.anInt3062);
		arg0.method4957(this.anInt3055);
		arg0.method4957(this.anInt3075);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BZI)V")
	public final void method2777(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (Static314.method5296(arg1)) {
			this.aBoolean267 = arg0;
		} else {
			this.aBoolean258 = arg0;
		}
	}
}
