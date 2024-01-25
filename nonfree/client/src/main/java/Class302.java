import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public final class Class302 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	public int anInt8555;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	public int anInt8556;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public int anInt8557;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	public int anInt8558;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class302() {
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!sc;)V")
	public Class302(@OriginalArg(0) Class302 arg0) {
		this.anInt8557 = arg0.anInt8557;
		this.anInt8555 = arg0.anInt8555;
		this.anInt8556 = arg0.anInt8556;
		this.anInt8558 = arg0.anInt8558;
	}
}
