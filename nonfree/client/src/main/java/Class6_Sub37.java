import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public abstract class Class6_Sub37 extends Class6 {

	@OriginalMember(owner = "client!nea", name = "o", descriptor = "Z")
	protected boolean aBoolean399;

	@OriginalMember(owner = "client!nea", name = "t", descriptor = "Z")
	protected boolean aBoolean403;

	@OriginalMember(owner = "client!nea", name = "bb", descriptor = "Z")
	public boolean aBoolean412;

	@OriginalMember(owner = "client!nea", name = "s", descriptor = "Z")
	public boolean aBoolean402 = true;

	@OriginalMember(owner = "client!nea", name = "z", descriptor = "I")
	public int anInt6045 = 2;

	@OriginalMember(owner = "client!nea", name = "m", descriptor = "Z")
	public boolean aBoolean397 = true;

	@OriginalMember(owner = "client!nea", name = "q", descriptor = "Z")
	public boolean aBoolean400 = true;

	@OriginalMember(owner = "client!nea", name = "B", descriptor = "Z")
	public boolean aBoolean405 = true;

	@OriginalMember(owner = "client!nea", name = "F", descriptor = "I")
	public int anInt6048 = 0;

	@OriginalMember(owner = "client!nea", name = "E", descriptor = "I")
	public int anInt6047 = 127;

	@OriginalMember(owner = "client!nea", name = "L", descriptor = "I")
	public int anInt6054 = 0;

	@OriginalMember(owner = "client!nea", name = "C", descriptor = "Z")
	public boolean aBoolean406 = true;

	@OriginalMember(owner = "client!nea", name = "G", descriptor = "I")
	public int anInt6049 = 127;

	@OriginalMember(owner = "client!nea", name = "K", descriptor = "I")
	public int anInt6053 = 2;

	@OriginalMember(owner = "client!nea", name = "P", descriptor = "I")
	public int anInt6056 = 127;

	@OriginalMember(owner = "client!nea", name = "D", descriptor = "I")
	public int anInt6046 = 2;

	@OriginalMember(owner = "client!nea", name = "r", descriptor = "Z")
	public boolean aBoolean401 = false;

	@OriginalMember(owner = "client!nea", name = "x", descriptor = "Z")
	protected boolean aBoolean404 = true;

	@OriginalMember(owner = "client!nea", name = "M", descriptor = "Z")
	public boolean aBoolean407 = false;

	@OriginalMember(owner = "client!nea", name = "U", descriptor = "I")
	public int anInt6060 = 127;

	@OriginalMember(owner = "client!nea", name = "R", descriptor = "Z")
	public boolean aBoolean409 = true;

	@OriginalMember(owner = "client!nea", name = "H", descriptor = "I")
	protected int anInt6050 = 0;

	@OriginalMember(owner = "client!nea", name = "X", descriptor = "Z")
	public boolean aBoolean410 = true;

	@OriginalMember(owner = "client!nea", name = "J", descriptor = "I")
	public int anInt6052 = 0;

	@OriginalMember(owner = "client!nea", name = "y", descriptor = "I")
	protected int anInt6044 = 0;

	@OriginalMember(owner = "client!nea", name = "V", descriptor = "I")
	public int anInt6061 = 0;

	@OriginalMember(owner = "client!nea", name = "j", descriptor = "Z")
	public boolean aBoolean396 = true;

	@OriginalMember(owner = "client!nea", name = "p", descriptor = "I")
	protected int anInt6040 = 2;

	@OriginalMember(owner = "client!nea", name = "Q", descriptor = "I")
	public int anInt6057 = 0;

	@OriginalMember(owner = "client!nea", name = "S", descriptor = "I")
	public int anInt6058 = 127;

	@OriginalMember(owner = "client!nea", name = "cb", descriptor = "Z")
	public boolean aBoolean413 = true;

	@OriginalMember(owner = "client!nea", name = "O", descriptor = "Z")
	public boolean aBoolean408 = true;

	@OriginalMember(owner = "client!nea", name = "v", descriptor = "I")
	public int anInt6042 = 1;

	@OriginalMember(owner = "client!nea", name = "ab", descriptor = "Z")
	public boolean aBoolean411 = false;

	@OriginalMember(owner = "client!nea", name = "Z", descriptor = "I")
	public int anInt6064 = 3;

	@OriginalMember(owner = "client!nea", name = "fb", descriptor = "I")
	public int anInt6066 = 0;

	@OriginalMember(owner = "client!nea", name = "W", descriptor = "I")
	public int anInt6062 = 0;

	@OriginalMember(owner = "client!nea", name = "Y", descriptor = "I")
	public int anInt6063 = 3;

	@OriginalMember(owner = "client!nea", name = "n", descriptor = "Z")
	public boolean aBoolean398 = true;

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "()V")
	protected Class6_Sub37() {
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BZI)V")
	public final void method5145(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (Static244.method3522(arg1)) {
			this.aBoolean403 = arg0;
		} else {
			this.aBoolean399 = arg0;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!dga;B)V")
	public final void method5146(@OriginalArg(0) Class6_Sub14 arg0) {
		arg0.method6035(22);
		arg0.method6035(this.anInt6064);
		arg0.method6035(this.aBoolean404 ? 1 : 0);
		arg0.method6035(this.aBoolean400 ? 1 : 0);
		arg0.method6035(this.aBoolean402 ? 1 : 0);
		arg0.method6035(this.aBoolean405 ? 1 : 0);
		arg0.method6035(0);
		arg0.method6035(this.aBoolean410 ? 1 : 0);
		arg0.method6035(this.aBoolean408 ? 1 : 0);
		arg0.method6035(this.aBoolean413 ? 1 : 0);
		arg0.method6035(this.anInt6040);
		arg0.method6035(this.anInt6044);
		arg0.method6035(this.aBoolean403 ? 1 : 0);
		arg0.method6035(this.aBoolean399 ? 1 : 0);
		arg0.method6035(this.aBoolean396 ? 1 : 0);
		arg0.method6035(this.aBoolean406 ? 1 : 0);
		arg0.method6035(this.anInt6048);
		arg0.method6035(this.aBoolean397 ? 1 : 0);
		arg0.method6035(this.anInt6047);
		arg0.method6035(this.anInt6049);
		arg0.method6035(this.anInt6060);
		arg0.method6035(this.anInt6058);
		arg0.method6035(this.anInt6056);
		arg0.method5999(this.anInt6057);
		arg0.method5999(this.anInt6066);
		arg0.method6035(Static249.method3547());
		arg0.method5990(this.anInt6054);
		arg0.method6035(this.anInt6045);
		arg0.method6035(this.aBoolean407 ? 1 : 0);
		arg0.method6035(this.aBoolean412 ? 1 : 0);
		arg0.method6035(this.anInt6061);
		arg0.method6035(this.aBoolean411 ? 1 : 0);
		arg0.method6035(this.aBoolean398 ? 1 : 0);
		arg0.method6035(this.anInt6042);
		arg0.method6035(this.aBoolean409 ? 1 : 0);
		arg0.method6035(this.anInt6046);
		arg0.method6035(this.anInt6053);
		arg0.method6035(this.aBoolean401 ? 1 : 0);
		arg0.method6035(this.anInt6063);
		arg0.method6035(this.anInt6050);
		arg0.method6035(this.anInt6062);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IBI)V")
	public final void method5148(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static244.method3522(arg0)) {
			this.anInt6040 = arg1;
		} else {
			this.anInt6044 = arg1;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IB)I")
	public final int method5149(@OriginalArg(0) int arg0) {
		return Static244.method3522(arg0) ? this.anInt6040 : this.anInt6044;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ZI)Z")
	public final boolean method5151(@OriginalArg(1) int arg0) {
		return Static244.method3522(arg0) ? this.aBoolean403 : this.aBoolean399;
	}
}
