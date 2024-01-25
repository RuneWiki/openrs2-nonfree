import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public final class Class131 {

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
	private final int anInt3837;

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "Lclient!wq;")
	private final Class376 aClass376_5;

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
	public final int anInt3841;

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
	public final int anInt3838;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IILclient!wq;)V")
	public Class131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class376 arg2) {
		this.anInt3837 = arg1;
		this.aClass376_5 = arg2;
		this.anInt3841 = arg0;
		this.anInt3838 = this.aClass376_5.anInt10167 * this.anInt3837;
		if (this.anInt3841 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
