import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class315 {

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "Lclient!ht;")
	public Interface11 anInterface11_1 = null;

	@OriginalMember(owner = "client!tca", name = "i", descriptor = "[Lclient!em;")
	private Interface6[] anInterface6Array2 = null;

	@OriginalMember(owner = "client!tca", name = "g", descriptor = "[Lclient!em;")
	public Interface6[] anInterface6Array1 = null;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "Z")
	public boolean aBoolean597;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!kea;)V")
	public Class315(@OriginalArg(0) Class14_Sub2 arg0) {
		this.aBoolean597 = arg0.aBoolean610;
		if (this.aBoolean597 && !arg0.method6989(Static132.aClass219_8, Static239.aClass161_12)) {
			this.aBoolean597 = false;
		}
		if (this.aBoolean597 || arg0.method6924(Static239.aClass161_12, Static132.aClass219_8)) {
			Static456.method6437();
			if (this.aBoolean597) {
				@Pc(48) byte[] local48 = Static36.method965(Static507.anObject16, false);
				this.anInterface11_1 = arg0.method6908(local48, Static132.aClass219_8);
				@Pc(63) byte[] local63 = Static36.method965(Static532.anObject19, false);
				arg0.method6908(local63, Static132.aClass219_8);
			} else {
				this.anInterface6Array1 = new Interface6[16];
				for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
					@Pc(93) byte[] local93 = Static597.method7851(local79 * 128 * 128 * 2, Static507.anObject16);
					this.anInterface6Array1[local79] = arg0.method6934(128, local93, true, Static132.aClass219_8, 128);
				}
				this.anInterface6Array2 = new Interface6[16];
				for (@Pc(115) int local115 = 0; local115 < 16; local115++) {
					@Pc(129) byte[] local129 = Static597.method7851(128 * 128 * local115 * 2, Static532.anObject19);
					this.anInterface6Array2[local115] = arg0.method6934(128, local129, true, Static132.aClass219_8, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)Z")
	public boolean method6759() {
		if (this.aBoolean597) {
			return this.anInterface11_1 != null;
		} else {
			return this.anInterface6Array1 != null;
		}
	}
}
