import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public interface Interface17 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZI[B)V")
	void method6786(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)I")
	int method6787();

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)J")
	long method6788();

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)I")
	int method6789();
}
