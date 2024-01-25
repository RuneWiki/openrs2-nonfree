import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public final class Class278 {

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
	private final int anInt7368;

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
	public final int anInt7373;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "Lclient!hu;")
	private final Class167 aClass167_18;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public final int anInt7370;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(IILclient!hu;)V")
	public Class278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class167 arg2) {
		this.anInt7368 = arg1;
		this.anInt7373 = arg0;
		this.aClass167_18 = arg2;
		this.anInt7370 = this.anInt7368 * this.aClass167_18.anInt3992;
		if (this.anInt7373 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ok", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
