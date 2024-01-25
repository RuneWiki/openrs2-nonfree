import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public final class Class190 {

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "Z")
	public boolean aBoolean371;

	@OriginalMember(owner = "client!kga", name = "f", descriptor = "Lclient!jea;")
	public Interface13 anInterface13_3;

	@OriginalMember(owner = "client!kga", name = "i", descriptor = "Lclient!jea;")
	public Interface13 anInterface13_4;

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "Z")
	public boolean aBoolean370;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Z)V")
	public Class190(@OriginalArg(0) boolean arg0) {
		this.aBoolean370 = arg0;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V")
	public void method3932() {
		if (this.anInterface13_3 != null) {
			this.anInterface13_3.method5601();
		}
		this.aBoolean371 = false;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)Z")
	public boolean method3933() {
		return this.aBoolean371 && !this.aBoolean370;
	}
}
