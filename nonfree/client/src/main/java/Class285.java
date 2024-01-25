import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class285 {

	@OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
	private int anInt8398 = 0;

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "I")
	private int anInt8400 = 0;

	@OriginalMember(owner = "client!pfa", name = "j", descriptor = "I")
	private int anInt8394 = 0;

	@OriginalMember(owner = "client!pfa", name = "g", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_32;

	@OriginalMember(owner = "client!pfa", name = "o", descriptor = "Lclient!taa;")
	private final Class349 aClass349_5;

	@OriginalMember(owner = "client!pfa", name = "n", descriptor = "[Lclient!ov;")
	private final Class43[] aClass43Array1;

	@OriginalMember(owner = "client!pfa", name = "h", descriptor = "Lclient!caa;")
	public final Class43_Sub1 aClass43_Sub1_1;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lclient!gia;)V")
	public Class285(@OriginalArg(0) Class67_Sub2 arg0) {
		this.aClass67_Sub2_32 = arg0;
		this.aClass349_5 = new Class349(arg0);
		this.aClass43Array1 = new Class43[10];
		this.aClass43Array1[1] = new Class43_Sub4(arg0);
		this.aClass43Array1[2] = new Class43_Sub8(arg0, this.aClass349_5);
		this.aClass43Array1[4] = new Class43_Sub5(arg0, this.aClass349_5);
		this.aClass43Array1[5] = new Class43_Sub2(arg0, this.aClass349_5);
		this.aClass43Array1[6] = new Class43_Sub7(arg0);
		this.aClass43Array1[7] = new Class43_Sub3(arg0);
		this.aClass43Array1[3] = this.aClass43_Sub1_1 = new Class43_Sub1(arg0);
		this.aClass43Array1[8] = new Class43_Sub6(arg0, this.aClass349_5);
		this.aClass43Array1[9] = new Class43_Sub9(arg0, this.aClass349_5);
		if (!this.aClass43Array1[8].method8859()) {
			this.aClass43Array1[8] = this.aClass43Array1[4];
		}
		if (!this.aClass43Array1[9].method8859()) {
			this.aClass43Array1[9] = this.aClass43Array1[8];
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IILclient!sga;)Z")
	public boolean method7046(@OriginalArg(0) int arg0, @OriginalArg(2) Class245 arg1) {
		if (this.anInt8398 == 0) {
			return false;
		} else {
			this.aClass43Array1[Integer.MAX_VALUE & this.anInt8398].method8865(arg0, arg1);
			return true;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZIZIZI)V")
	public void method7050(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = arg3 & this.aClass67_Sub2_32.method7651();
		if (!local5 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			if (arg2 == 4) {
				arg4 = arg1;
			}
			arg2 = 2;
		}
		if (arg2 != 0 && arg0) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt8398) {
			if (this.anInt8398 != 0) {
				this.aClass43Array1[this.anInt8398 & Integer.MAX_VALUE].method8866();
			}
			if (arg2 != 0) {
				this.aClass43Array1[Integer.MAX_VALUE & arg2].method8863(arg0);
				this.aClass43Array1[arg2 & Integer.MAX_VALUE].method8858(arg0);
				this.aClass43Array1[Integer.MAX_VALUE & arg2].method8860(arg4, arg1);
			}
			this.anInt8400 = arg1;
			this.anInt8398 = arg2;
			this.anInt8394 = arg4;
		} else if (this.anInt8398 != 0) {
			this.aClass43Array1[this.anInt8398 & Integer.MAX_VALUE].method8858(arg0);
			if (this.anInt8400 != arg1 || arg4 != this.anInt8394) {
				this.aClass43Array1[this.anInt8398 & Integer.MAX_VALUE].method8860(arg4, arg1);
				this.anInt8400 = arg1;
				this.anInt8394 = arg4;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(II)Z")
	public boolean method7053() {
		return this.aClass43Array1[3].method8859();
	}
}
