import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public class Class156 implements Interface16 {

	@OriginalMember(owner = "client!iba", name = "f", descriptor = "Lclient!hh;")
	protected Class6 aClass6_25;

	@OriginalMember(owner = "client!iba", name = "h", descriptor = "Lclient!uq;")
	private final Class362 aClass362_96;

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "Lclient!vh;")
	protected final Class89 aClass89_2;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!uq;Lclient!vh;)V")
	public Class156(@OriginalArg(0) Class362 arg0, @OriginalArg(1) Class89 arg1) {
		this.aClass362_96 = arg0;
		this.aClass89_2 = arg1;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method8281() {
		return this.aClass362_96.method8365(this.aClass89_2.anInt2185);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)V")
	@Override
	public final void method8280() {
		this.aClass6_25 = Static392.method5476(this.aClass362_96, this.aClass89_2.anInt2185);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8282() {
		@Pc(25) int local25 = this.aClass89_2.aClass266_10.method5919(Static95.anInt9415, this.aClass6_25.method5130()) + this.aClass89_2.anInt2186;
		@Pc(39) int local39 = this.aClass89_2.aClass131_13.method3034(this.aClass6_25.method5134(), Static195.anInt3525) + this.aClass89_2.anInt2184;
		this.aClass6_25.method5115(local25, local39);
	}
}
