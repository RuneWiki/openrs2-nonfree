import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class333 {

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "Lclient!d;")
	private Class2 aClass2_250;

	@OriginalMember(owner = "client!ufa", name = "h", descriptor = "Lclient!il;")
	private Class162 aClass162_39;

	@OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
	private int anInt8754 = 0;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "()V")
	private Class333() {
	}

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lclient!il;)V")
	public Class333(@OriginalArg(0) Class162 arg0) {
		this.aClass162_39 = arg0;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)Lclient!d;")
	public Class2 method7308() {
		@Pc(23) Class2 local23;
		if (this.anInt8754 > 0 && this.aClass2_250 != this.aClass162_39.aClass2Array1[this.anInt8754 - 1]) {
			local23 = this.aClass2_250;
			this.aClass2_250 = local23.aClass2_286;
			return local23;
		}
		while (this.aClass162_39.anInt4211 > this.anInt8754) {
			local23 = this.aClass162_39.aClass2Array1[this.anInt8754++].aClass2_286;
			if (local23 != this.aClass162_39.aClass2Array1[this.anInt8754 - 1]) {
				this.aClass2_250 = local23.aClass2_286;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)Lclient!d;")
	public Class2 method7310() {
		this.anInt8754 = 0;
		return this.method7308();
	}
}
