import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public final class Class126 {

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "Z")
	public boolean aBoolean302;

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "Lclient!nba;")
	public Interface16 anInterface16_9;

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "Lclient!nba;")
	public Interface16 anInterface16_10;

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "Z")
	public boolean aBoolean303;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Z)V")
	public Class126(@OriginalArg(0) boolean arg0) {
		this.aBoolean303 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)Z")
	public boolean method3015() {
		return this.aBoolean302 && !this.aBoolean303;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public void method3016() {
		if (this.anInterface16_9 != null) {
			this.anInterface16_9.method5772();
		}
		this.aBoolean302 = false;
	}
}
