import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public final class Class356 {

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "Lclient!wj;")
	private final Class389 aClass389_12;

	@OriginalMember(owner = "client!uia", name = "l", descriptor = "I")
	public final int anInt10151;

	@OriginalMember(owner = "client!uia", name = "j", descriptor = "I")
	private final int anInt10149;

	@OriginalMember(owner = "client!uia", name = "k", descriptor = "I")
	public final int anInt10150;

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(IILclient!wj;)V")
	public Class356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class389 arg2) {
		this.aClass389_12 = arg2;
		this.anInt10151 = arg0;
		this.anInt10149 = arg1;
		this.anInt10150 = this.aClass389_12.anInt10800 * this.anInt10149;
		if (this.anInt10151 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
