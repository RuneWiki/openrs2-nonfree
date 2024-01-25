import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public class Class30 implements Interface27 {

	@OriginalMember(owner = "client!er", name = "j", descriptor = "[I")
	public static final int[] anIntArray30 = new int[256];

	@OriginalMember(owner = "client!er", name = "i", descriptor = "Lclient!tb;")
	protected Class49 aClass49_4;

	@OriginalMember(owner = "client!er", name = "k", descriptor = "Lclient!lga;")
	private final Class223 aClass223_5;

	@OriginalMember(owner = "client!er", name = "l", descriptor = "Lclient!qj;")
	protected final Class137 aClass137_2;

	static {
		for (@Pc(73) int local73 = 0; local73 < 256; local73++) {
			@Pc(76) int local76 = local73;
			for (@Pc(78) int local78 = 0; local78 < 8; local78++) {
				if ((local76 & 0x1) == 1) {
					local76 = local76 >>> 1 ^ 0xEDB88320;
				} else {
					local76 >>>= 0x1;
				}
			}
			anIntArray30[local73] = local76;
		}
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!lga;Lclient!qj;)V")
	public Class30(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class137 arg1) {
		this.aClass223_5 = arg0;
		this.aClass137_2 = arg1;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	@Override
	public final void method8040() {
		this.aClass49_4 = Static527.method7563(this.aClass223_5, this.aClass137_2.anInt4035);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8038() {
		return this.aClass223_5.method5285(this.aClass137_2.anInt4035);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8039() {
		@Pc(15) int local15 = this.aClass137_2.aClass318_11.method7565(this.aClass49_4.method8991(), Static339.anInt5789) + this.aClass137_2.anInt4036;
		@Pc(29) int local29 = this.aClass137_2.aClass238_6.method5892(this.aClass49_4.method8987(), Static48.anInt6772) + this.aClass137_2.anInt4034;
		this.aClass49_4.method8997(local15, local29);
	}
}
