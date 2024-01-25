import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class22 {

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "Lclient!ge;")
	private Class4 aClass4_37;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
	private int anInt792 = 0;

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "Lclient!dj;")
	private final Class43 aClass43_4;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!dj;)V")
	public Class22(@OriginalArg(0) Class43 arg0) {
		this.aClass43_4 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)Lclient!ge;")
	public Class4 method551() {
		@Pc(22) Class4 local22;
		if (this.anInt792 > 0 && this.aClass43_4.aClass4Array1[this.anInt792 - 1] != this.aClass4_37) {
			local22 = this.aClass4_37;
			this.aClass4_37 = local22.aClass4_252;
			return local22;
		}
		while (this.anInt792 < this.aClass43_4.anInt1579) {
			local22 = this.aClass43_4.aClass4Array1[this.anInt792++].aClass4_252;
			if (this.aClass43_4.aClass4Array1[this.anInt792 - 1] != local22) {
				this.aClass4_37 = local22.aClass4_252;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)Lclient!ge;")
	public Class4 method554() {
		this.anInt792 = 0;
		return this.method551();
	}
}
