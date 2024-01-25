import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public class Class36 implements Interface27 {

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "Lclient!fd;")
	protected Class103 aClass103_2;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "Lclient!uu;")
	private final Class343 aClass343_35;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Lclient!dca;")
	protected final Class66 aClass66_2;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!uu;Lclient!dca;)V")
	public Class36(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Class66 arg1) {
		this.aClass343_35 = arg0;
		this.aClass66_2 = arg1;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8108() {
		@Pc(25) int local25 = this.aClass66_2.aClass293_8.method7212(Static623.anInt9971, this.aClass103_2.method7454()) + this.aClass66_2.anInt8331;
		@Pc(40) int local40 = this.aClass66_2.aClass15_10.method259(this.aClass103_2.method7451(), Static269.anInt5258) + this.aClass66_2.anInt8333;
		this.aClass103_2.method7462(local25, local40);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	@Override
	public final void method8107() {
		this.aClass103_2 = Static209.method3272(this.aClass343_35, this.aClass66_2.anInt8337);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8109() {
		return this.aClass343_35.method8138(this.aClass66_2.anInt8337);
	}
}
