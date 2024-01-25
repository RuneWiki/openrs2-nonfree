import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class225 {

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "Lclient!kha;")
	private final Class181 aClass181_68;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
	public final int anInt7016;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;)V")
	public Class225(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2) {
		new Class112(64);
		this.aClass181_68 = arg2;
		this.anInt7016 = this.aClass181_68.method5025(15);
	}
}
