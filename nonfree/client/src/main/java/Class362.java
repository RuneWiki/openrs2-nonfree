import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class362 {

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
	private final int anInt10078;

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
	public final int anInt10081;

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "Lclient!ok;")
	private final Class242 aClass242_20;

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
	public final int anInt10082;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(IILclient!ok;)V")
	public Class362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class242 arg2) {
		this.anInt10078 = arg1;
		this.anInt10081 = arg0;
		this.aClass242_20 = arg2;
		this.anInt10082 = this.aClass242_20.anInt7529 * this.anInt10078;
		if (this.anInt10081 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
