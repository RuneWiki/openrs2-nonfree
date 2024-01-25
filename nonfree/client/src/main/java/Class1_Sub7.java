import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public abstract class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!av", name = "q", descriptor = "Z")
	protected boolean aBoolean221;

	@OriginalMember(owner = "client!av", name = "M", descriptor = "Z")
	protected boolean aBoolean229;

	@OriginalMember(owner = "client!av", name = "S", descriptor = "Z")
	public boolean aBoolean231;

	@OriginalMember(owner = "client!av", name = "k", descriptor = "Z")
	public boolean aBoolean219 = true;

	@OriginalMember(owner = "client!av", name = "l", descriptor = "I")
	public int anInt3089 = 0;

	@OriginalMember(owner = "client!av", name = "v", descriptor = "Z")
	public boolean aBoolean222 = false;

	@OriginalMember(owner = "client!av", name = "w", descriptor = "I")
	public int anInt3096 = 127;

	@OriginalMember(owner = "client!av", name = "A", descriptor = "Z")
	public boolean aBoolean225 = true;

	@OriginalMember(owner = "client!av", name = "n", descriptor = "I")
	public int anInt3090 = 0;

	@OriginalMember(owner = "client!av", name = "F", descriptor = "Z")
	public boolean aBoolean226 = true;

	@OriginalMember(owner = "client!av", name = "E", descriptor = "I")
	public int anInt3101 = 3;

	@OriginalMember(owner = "client!av", name = "m", descriptor = "Z")
	public boolean aBoolean220 = true;

	@OriginalMember(owner = "client!av", name = "H", descriptor = "Z")
	public boolean aBoolean227 = true;

	@OriginalMember(owner = "client!av", name = "G", descriptor = "I")
	public int anInt3102 = 127;

	@OriginalMember(owner = "client!av", name = "O", descriptor = "Z")
	public boolean aBoolean230 = true;

	@OriginalMember(owner = "client!av", name = "I", descriptor = "Z")
	public boolean aBoolean228 = true;

	@OriginalMember(owner = "client!av", name = "L", descriptor = "I")
	public int anInt3105 = 0;

	@OriginalMember(owner = "client!av", name = "D", descriptor = "I")
	public int anInt3100 = 0;

	@OriginalMember(owner = "client!av", name = "V", descriptor = "Z")
	public boolean aBoolean232 = false;

	@OriginalMember(owner = "client!av", name = "ab", descriptor = "Z")
	public boolean aBoolean234 = true;

	@OriginalMember(owner = "client!av", name = "Z", descriptor = "Z")
	public boolean aBoolean233 = true;

	@OriginalMember(owner = "client!av", name = "s", descriptor = "I")
	public int anInt3093 = 0;

	@OriginalMember(owner = "client!av", name = "K", descriptor = "I")
	protected int anInt3104 = 0;

	@OriginalMember(owner = "client!av", name = "U", descriptor = "I")
	public int anInt3111 = 127;

	@OriginalMember(owner = "client!av", name = "y", descriptor = "Z")
	public boolean aBoolean224 = true;

	@OriginalMember(owner = "client!av", name = "N", descriptor = "I")
	protected int anInt3106 = 2;

	@OriginalMember(owner = "client!av", name = "P", descriptor = "I")
	public int anInt3107 = 127;

	@OriginalMember(owner = "client!av", name = "j", descriptor = "I")
	protected int anInt3088 = 0;

	@OriginalMember(owner = "client!av", name = "Y", descriptor = "I")
	public int anInt3113 = 2;

	@OriginalMember(owner = "client!av", name = "x", descriptor = "Z")
	public boolean aBoolean223 = false;

	@OriginalMember(owner = "client!av", name = "J", descriptor = "I")
	public int anInt3103 = 127;

	@OriginalMember(owner = "client!av", name = "eb", descriptor = "I")
	public int anInt3115 = 2;

	@OriginalMember(owner = "client!av", name = "bb", descriptor = "Z")
	protected boolean aBoolean235 = true;

	@OriginalMember(owner = "client!av", name = "cb", descriptor = "I")
	public int anInt3114 = 0;

	@OriginalMember(owner = "client!av", name = "gb", descriptor = "I")
	public int anInt3117 = 0;

	@OriginalMember(owner = "client!av", name = "p", descriptor = "I")
	public int anInt3091 = 3;

	@OriginalMember(owner = "client!av", name = "T", descriptor = "I")
	public int anInt3110 = 1;

	@OriginalMember(owner = "client!av", name = "z", descriptor = "I")
	public int anInt3097 = 2;

	@OriginalMember(owner = "client!av", name = "db", descriptor = "Z")
	public boolean aBoolean236 = true;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "()V")
	protected Class1_Sub7() {
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BII)V")
	public final void method2614(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static88.method1741(arg1)) {
			this.anInt3106 = arg0;
		} else {
			this.anInt3088 = arg0;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IZI)V")
	public final void method2616(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (Static88.method1741(arg1)) {
			this.aBoolean229 = arg0;
		} else {
			this.aBoolean221 = arg0;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)Z")
	public final boolean method2618(@OriginalArg(0) int arg0) {
		return Static88.method1741(arg0) ? this.aBoolean229 : this.aBoolean221;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BLclient!io;)V")
	public final void method2619(@OriginalArg(1) Class1_Sub20 arg0) {
		arg0.method4378(22);
		arg0.method4378(this.anInt3091);
		arg0.method4378(this.aBoolean235 ? 1 : 0);
		arg0.method4378(this.aBoolean227 ? 1 : 0);
		arg0.method4378(this.aBoolean220 ? 1 : 0);
		arg0.method4378(this.aBoolean219 ? 1 : 0);
		arg0.method4378(0);
		arg0.method4378(this.aBoolean224 ? 1 : 0);
		arg0.method4378(this.aBoolean234 ? 1 : 0);
		arg0.method4378(this.aBoolean225 ? 1 : 0);
		arg0.method4378(this.anInt3106);
		arg0.method4378(this.anInt3088);
		arg0.method4378(this.aBoolean229 ? 1 : 0);
		arg0.method4378(this.aBoolean221 ? 1 : 0);
		arg0.method4378(this.aBoolean228 ? 1 : 0);
		arg0.method4378(this.aBoolean230 ? 1 : 0);
		arg0.method4378(this.anInt3093);
		arg0.method4378(this.aBoolean233 ? 1 : 0);
		arg0.method4378(this.anInt3096);
		arg0.method4378(this.anInt3102);
		arg0.method4378(this.anInt3103);
		arg0.method4378(this.anInt3107);
		arg0.method4378(this.anInt3111);
		arg0.method4381(this.anInt3117);
		arg0.method4381(this.anInt3089);
		arg0.method4378(Static484.method6768());
		arg0.method4421(this.anInt3090);
		arg0.method4378(this.anInt3097);
		arg0.method4378(this.aBoolean222 ? 1 : 0);
		arg0.method4378(this.aBoolean231 ? 1 : 0);
		arg0.method4378(this.anInt3100);
		arg0.method4378(this.aBoolean232 ? 1 : 0);
		arg0.method4378(this.aBoolean236 ? 1 : 0);
		arg0.method4378(this.anInt3110);
		arg0.method4378(this.aBoolean226 ? 1 : 0);
		arg0.method4378(this.anInt3115);
		arg0.method4378(this.anInt3113);
		arg0.method4378(this.aBoolean223 ? 1 : 0);
		arg0.method4378(this.anInt3101);
		arg0.method4378(this.anInt3104);
		arg0.method4378(this.anInt3114);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BI)I")
	public final int method2620(@OriginalArg(1) int arg0) {
		return Static88.method1741(arg0) ? this.anInt3106 : this.anInt3088;
	}
}
