import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jia")
public class Class103 implements Interface27 {

	@OriginalMember(owner = "client!jia", name = "l", descriptor = "Lclient!vr;")
	protected Class33 aClass33_7;

	@OriginalMember(owner = "client!jia", name = "b", descriptor = "Lclient!mo;")
	protected final Class222 aClass222_2;

	@OriginalMember(owner = "client!jia", name = "e", descriptor = "Lclient!aj;")
	private final Class15 aClass15_48;

	@OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Lclient!aj;Lclient!mo;)V")
	public Class103(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class222 arg1) {
		this.aClass222_2 = arg1;
		this.aClass15_48 = arg0;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)V")
	@Override
	public final void method7758() {
		this.aClass33_7 = Static343.method5151(this.aClass15_48, this.aClass222_2.anInt6028);
	}

	@OriginalMember(owner = "client!jia", name = "b", descriptor = "(I)Z")
	@Override
	public final boolean method7759() {
		return this.aClass15_48.method526(this.aClass222_2.anInt6028);
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7760() {
		@Pc(16) int local16 = this.aClass222_2.aClass356_11.method8711(this.aClass33_7.method7645(), Static33.anInt10742) + this.aClass222_2.anInt6030;
		@Pc(30) int local30 = this.aClass222_2.aClass56_13.method1354(Static602.anInt9666, this.aClass33_7.method7658()) + this.aClass222_2.anInt6031;
		this.aClass33_7.method7654(local16, local30);
	}
}
