import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public interface Interface3 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)V")
	void method3547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I[BI)V")
	void method3548(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "()I")
	int method5130();
}
