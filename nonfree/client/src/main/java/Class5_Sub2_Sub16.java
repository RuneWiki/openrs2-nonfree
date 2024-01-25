import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class5_Sub2_Sub16 extends Class5_Sub2 {

	@OriginalMember(owner = "client!te", name = "A", descriptor = "I")
	public int anInt6376;

	@OriginalMember(owner = "client!te", name = "B", descriptor = "I")
	public int anInt6377;

	@OriginalMember(owner = "client!te", name = "G", descriptor = "I")
	public int anInt6379;

	@OriginalMember(owner = "client!te", name = "H", descriptor = "I")
	public int anInt6380;

	@OriginalMember(owner = "client!te", name = "L", descriptor = "I")
	public int anInt6383;

	@OriginalMember(owner = "client!te", name = "F", descriptor = "Lclient!u;")
	public final Class236 aClass236_1;

	@OriginalMember(owner = "client!te", name = "I", descriptor = "Lclient!dv;")
	public final Class55 aClass55_1;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!u;Lclient!td;)V")
	public Class5_Sub2_Sub16(@OriginalArg(0) Class236 arg0, @OriginalArg(1) Class88_Sub6 arg1) {
		this.aClass236_1 = arg0;
		this.aClass55_1 = this.aClass236_1.method5358();
		this.method5066();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public void method5066() {
		this.anInt6377 = this.aClass236_1.anInt6774;
		this.anInt6380 = this.aClass236_1.anInt6775;
		this.anInt6379 = this.aClass236_1.anInt6781;
		if (this.aClass236_1.aClass29_7 != null) {
			this.aClass236_1.aClass29_7.K(this.aClass55_1.anInt1551, this.aClass55_1.anInt1562, this.aClass55_1.anInt1549, Static286.anIntArray347);
		}
		this.anInt6376 = Static286.anIntArray347[2];
		this.anInt6383 = Static286.anIntArray347[0];
	}
}
