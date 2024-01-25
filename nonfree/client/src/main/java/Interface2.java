import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public interface Interface2 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)I")
	int method5942();

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)J")
	long method5943();

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I")
	int method5944();

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "([BIII)V")
	void method5945(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1);
}
